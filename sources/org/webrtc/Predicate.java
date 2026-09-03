package org.webrtc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public interface Predicate<T> {

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public abstract /* synthetic */ class -CC {
        public static Predicate a(final Predicate predicate, final Predicate predicate2) {
            return new Predicate() { // from class: org.webrtc.Predicate.2
                @Override // org.webrtc.Predicate
                public final /* synthetic */ Predicate and(Predicate predicate3) {
                    return -CC.a(this, predicate3);
                }

                @Override // org.webrtc.Predicate
                public final /* synthetic */ Predicate negate() {
                    return -CC.b(this);
                }

                @Override // org.webrtc.Predicate
                public final /* synthetic */ Predicate or(Predicate predicate3) {
                    return -CC.c(this, predicate3);
                }

                @Override // org.webrtc.Predicate
                public boolean test(Object obj) {
                    return Predicate.this.test(obj) && predicate2.test(obj);
                }
            };
        }

        public static Predicate b(final Predicate predicate) {
            return new Predicate() { // from class: org.webrtc.Predicate.3
                @Override // org.webrtc.Predicate
                public final /* synthetic */ Predicate and(Predicate predicate2) {
                    return -CC.a(this, predicate2);
                }

                @Override // org.webrtc.Predicate
                public final /* synthetic */ Predicate negate() {
                    return -CC.b(this);
                }

                @Override // org.webrtc.Predicate
                public final /* synthetic */ Predicate or(Predicate predicate2) {
                    return -CC.c(this, predicate2);
                }

                @Override // org.webrtc.Predicate
                public boolean test(Object obj) {
                    return !Predicate.this.test(obj);
                }
            };
        }

        public static Predicate c(final Predicate predicate, final Predicate predicate2) {
            return new Predicate() { // from class: org.webrtc.Predicate.1
                @Override // org.webrtc.Predicate
                public final /* synthetic */ Predicate and(Predicate predicate3) {
                    return -CC.a(this, predicate3);
                }

                @Override // org.webrtc.Predicate
                public final /* synthetic */ Predicate negate() {
                    return -CC.b(this);
                }

                @Override // org.webrtc.Predicate
                public final /* synthetic */ Predicate or(Predicate predicate3) {
                    return -CC.c(this, predicate3);
                }

                @Override // org.webrtc.Predicate
                public boolean test(Object obj) {
                    return Predicate.this.test(obj) || predicate2.test(obj);
                }
            };
        }
    }

    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    Predicate<T> or(Predicate<? super T> predicate);

    boolean test(T t6);
}
