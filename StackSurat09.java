public class StackSurat09 {
        Surat09[] tumpukan;
        int top;
        int size;
    
        public StackSurat09(int size) {
            this.size = size;
            tumpukan = new Surat09[size];
            top = -1;
        }
    
        public boolean isEmpty() {
            return top == -1;
        }
    
        public boolean isFull() {
            return top == size - 1;
        }
    
        public void push(Surat09 surat) {
            if (!isFull()) {
                tumpukan[++top] = surat;
            } else {
                System.out.println("Tumpukan surat penuh.");
            }
        }
    
        public Surat09 pop() {
            if (!isEmpty()) {
                return tumpukan[top--];
            } else {
                System.out.println("Tidak ada surat untuk diproses.");
                return null;
            }
        }
    
        public Surat09 peek() {
            if (!isEmpty()) {
                return tumpukan[top];
            } else {
                return null;
            }
        }
    
        public Surat09 cariSurat(String nama) {
            for (int i = top; i >= 0; i--) {
                if (tumpukan[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                    return tumpukan[i]; 
                }
            }
            return null;
        }
        
    
    
}
