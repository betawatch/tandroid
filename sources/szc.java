// default package

import android.view.WindowInsets;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class szc extends rzc {
    public static final wzc s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        s = wzc.h(null, windowInsets);
    }

    public szc(wzc wzcVar, WindowInsets windowInsets) {
        super(wzcVar, windowInsets);
    }

    @Override // rzc, nzc, tzc
    public iq5 f(int i) {
        return iq5.c(this.c.getInsets(vzc.a(i)));
    }

    @Override // rzc, nzc, tzc
    public iq5 g(int i) {
        return iq5.c(this.c.getInsetsIgnoringVisibility(vzc.a(i)));
    }

    @Override // rzc, nzc, tzc
    public boolean p(int i) {
        return this.c.isVisible(vzc.a(i));
    }
}
