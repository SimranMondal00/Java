
import java.lang.Exception;
public class CustomS {
        protected int[] data;
        private static final int DEFAULT_SIZE = 10;
        int ptr = -1;

        public CustomS() {
            this(DEFAULT_SIZE);
        }

        public CustomS(int size) {
            this.data = new int[size];
        }

        public boolean push(int value) {
            if (isFull()) {
                System.out.println("the stack is full");
                return false;
            }
            ptr++;
            data[ptr] = value;
            return true;
        }

        public boolean isFull() {
            return ptr == data.length - 1;
        }

        public boolean isEmpty() {
            return ptr == -1;
        }

        public int pop() throws Exception {
            if (isEmpty()) {
                throw new Exception("Stack is Empty");
            }
            int remove = data[ptr];
            ptr--;
            return remove;
        }

        public int peek() throws Exception {
            if (isEmpty()) {
                throw new Exception("Stack is empty");
            }
            return data[ptr];
        }
}

