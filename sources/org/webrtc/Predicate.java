package org.webrtc;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public interface Predicate<T> {

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
