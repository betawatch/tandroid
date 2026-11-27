package org.webrtc;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public interface Predicate<T> {

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    class 1 implements Predicate {
        final /* synthetic */ Predicate val$other;

        public 1(Predicate predicate) {
            this.val$other = predicate;
        }

        @Override // org.webrtc.Predicate
        public final Predicate and(Predicate predicate) {
            return new 2(predicate);
        }

        @Override // org.webrtc.Predicate
        public final Predicate negate() {
            return new 3();
        }

        @Override // org.webrtc.Predicate
        public final Predicate or(Predicate predicate) {
            return new 1(predicate);
        }

        @Override // org.webrtc.Predicate
        public boolean test(Object obj) {
            return Predicate.this.test(obj) || this.val$other.test(obj);
        }
    }

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    class 2 implements Predicate {
        final /* synthetic */ Predicate val$other;

        public 2(Predicate predicate) {
            this.val$other = predicate;
        }

        @Override // org.webrtc.Predicate
        public final Predicate and(Predicate predicate) {
            return new 2(predicate);
        }

        @Override // org.webrtc.Predicate
        public final Predicate negate() {
            return new 3();
        }

        @Override // org.webrtc.Predicate
        public final Predicate or(Predicate predicate) {
            return new 1(predicate);
        }

        @Override // org.webrtc.Predicate
        public boolean test(Object obj) {
            return Predicate.this.test(obj) && this.val$other.test(obj);
        }
    }

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    class 3 implements Predicate {
        public 3() {
        }

        @Override // org.webrtc.Predicate
        public final Predicate and(Predicate predicate) {
            return new 2(predicate);
        }

        @Override // org.webrtc.Predicate
        public final Predicate negate() {
            return new 3();
        }

        @Override // org.webrtc.Predicate
        public final Predicate or(Predicate predicate) {
            return new 1(predicate);
        }

        @Override // org.webrtc.Predicate
        public boolean test(Object obj) {
            return !Predicate.this.test(obj);
        }
    }

    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    Predicate<T> or(Predicate<? super T> predicate);

    boolean test(T t);
}
