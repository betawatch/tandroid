package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class vp0 extends iq0 {
    public final /* synthetic */ int p0;
    public final /* synthetic */ org.telegram.messenger.ls q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp0(org.telegram.messenger.ls lsVar, Context context, lq0 lq0Var, FrameLayout frameLayout, int i7) {
        super(context, lq0Var, frameLayout);
        this.p0 = i7;
        this.q0 = lsVar;
    }

    @Override // org.telegram.ui.iq0
    public boolean D() {
        switch (this.p0) {
            case 0:
                return !((PhotoViewer) this.q0).s;
            default:
                return super.D();
        }
    }

    @Override // org.telegram.ui.iq0
    public void E() {
        switch (this.p0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.q0;
                if (secretMediaViewer.J && getScrollY() <= 0) {
                    org.telegram.messenger.g0.i3(secretMediaViewer.p1, 3000L);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.iq0
    public void F() {
        switch (this.p0) {
            case 1:
                org.telegram.messenger.g0.r(((SecretMediaViewer) this.q0).p1);
                break;
        }
    }

    @Override // org.telegram.ui.iq0
    public void G() {
        switch (this.p0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.q0;
                if (secretMediaViewer.I0 == null) {
                    secretMediaViewer.l(((float) getScrollY()) < ((float) getMeasuredHeight()) / 3.0f && secretMediaViewer.i0, true);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.p0) {
            case 0:
                super.invalidate();
                PhotoViewer photoViewer = (PhotoViewer) this.q0;
                vo0[] vo0VarArr = photoViewer.W0;
                ImageView[] imageViewArr = photoViewer.x3;
                if (photoViewer.J) {
                    int scrollY = getScrollY();
                    float translationY = photoViewer.Q1.getTranslationY();
                    boolean z9 = scrollY == 0 && translationY == 0.0f;
                    boolean z10 = scrollY == 0 && translationY == 0.0f;
                    if (!z9) {
                        int b10 = vo0VarArr[0].b() + vo0VarArr[0].j;
                        int top = (((photoViewer.Z1.getTop() + ((int) translationY)) - scrollY) + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (D() ? org.telegram.messenger.g0.m : 0))) - org.telegram.messenger.g0.L(12.0f);
                        boolean z11 = top > org.telegram.messenger.g0.L(32.0f) + ((int) imageViewArr[0].getY());
                        z9 = top > b10;
                        z10 = z11;
                    }
                    if (photoViewer.y3) {
                        if (imageViewArr[0].getTag() != null && ((Integer) imageViewArr[0].getTag()).intValue() == 3 && z10) {
                            imageViewArr[0].setTag(2);
                            imageViewArr[0].animate().alpha(1.0f).setDuration(150L).setListener(new d30(this, 13)).start();
                        } else if (imageViewArr[0].getTag() == null && !z10) {
                            imageViewArr[0].setTag(3);
                            imageViewArr[0].animate().alpha(0.0f).setListener(null).setDuration(150L).start();
                        }
                    }
                    vo0VarArr[0].e(2, z9 ? 1.0f : 0.0f, true);
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }
}
