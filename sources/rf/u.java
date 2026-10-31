package rf;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public enum u {
    /* JADX INFO: Fake field, exist only in values array */
    EF7(0, "unknown delay"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17(1, "input"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27(2, "animation"),
    /* JADX INFO: Fake field, exist only in values array */
    EF37(3, "layout"),
    /* JADX INFO: Fake field, exist only in values array */
    EF47(4, "draw"),
    /* JADX INFO: Fake field, exist only in values array */
    EF57(5, "sync"),
    /* JADX INFO: Fake field, exist only in values array */
    EF67(6, "cmd issue"),
    /* JADX INFO: Fake field, exist only in values array */
    EF81(7, "swap buffers"),
    /* JADX INFO: Fake field, exist only in values array */
    EF96(31, "GPU_DURATION", "gpu"),
    /* JADX INFO: Fake field, exist only in values array */
    EF115(8, "total");

    public final int a;
    public final String b;
    public final int c;
    public long d;
    public double e;

    u(int i10, String str) {
        this(24, r7, str);
    }

    u(int i10, String str, String str2) {
        this.d = Long.MIN_VALUE;
        this.e = 0.0d;
        this.a = r4;
        this.b = str2;
        this.c = i10;
    }
}
