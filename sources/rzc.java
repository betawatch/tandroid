// default package

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class rzc extends qzc {
    public static final wzc r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        r = wzc.h(null, windowInsets);
    }

    public rzc(wzc wzcVar, WindowInsets windowInsets) {
        super(wzcVar, windowInsets);
    }

    @Override // nzc, tzc
    public iq5 f(int i) {
        return iq5.c(this.c.getInsets(uzc.a(i)));
    }

    @Override // nzc, tzc
    public iq5 g(int i) {
        return iq5.c(this.c.getInsetsIgnoringVisibility(uzc.a(i)));
    }

    @Override // nzc, tzc
    public boolean p(int i) {
        return this.c.isVisible(uzc.a(i));
    }

    @Override // nzc, tzc
    public final void d(View view) {
    }
}
