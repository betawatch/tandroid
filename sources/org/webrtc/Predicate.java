package org.webrtc;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public interface Predicate<T> {

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
