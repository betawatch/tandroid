package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class wp0 extends jq0 {
    public final /* synthetic */ int q0;
    public final /* synthetic */ org.telegram.messenger.gs r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wp0(org.telegram.messenger.gs gsVar, Context context, mq0 mq0Var, FrameLayout frameLayout, int i7) {
        super(context, mq0Var, frameLayout);
        this.q0 = i7;
        this.r0 = gsVar;
    }

    @Override // org.telegram.ui.jq0
    public boolean D() {
        switch (this.q0) {
            case 0:
                return !((PhotoViewer) this.r0).s;
            default:
                return super.D();
        }
    }

    @Override // org.telegram.ui.jq0
    public void E() {
        switch (this.q0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.r0;
                if (secretMediaViewer.K && getScrollY() <= 0) {
                    org.telegram.messenger.g0.h3(secretMediaViewer.q1, 3000L);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.jq0
    public void F() {
        switch (this.q0) {
            case 1:
                org.telegram.messenger.g0.r(((SecretMediaViewer) this.r0).q1);
                break;
        }
    }

    @Override // org.telegram.ui.jq0
    public void G() {
        switch (this.q0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.r0;
                if (secretMediaViewer.J0 == null) {
                    secretMediaViewer.l(((float) getScrollY()) < ((float) getMeasuredHeight()) / 3.0f && secretMediaViewer.j0, true);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.q0) {
            case 0:
                super.invalidate();
                PhotoViewer photoViewer = (PhotoViewer) this.r0;
                wo0[] wo0VarArr = photoViewer.X0;
                ImageView[] imageViewArr = photoViewer.y3;
                if (photoViewer.K) {
                    int scrollY = getScrollY();
                    float translationY = photoViewer.R1.getTranslationY();
                    boolean z10 = scrollY == 0 && translationY == 0.0f;
                    boolean z11 = scrollY == 0 && translationY == 0.0f;
                    if (!z10) {
                        int b10 = wo0VarArr[0].b() + wo0VarArr[0].j;
                        int top = (((photoViewer.a2.getTop() + ((int) translationY)) - scrollY) + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (D() ? org.telegram.messenger.g0.m : 0))) - org.telegram.messenger.g0.L(12.0f);
                        boolean z12 = top > org.telegram.messenger.g0.L(32.0f) + ((int) imageViewArr[0].getY());
                        z10 = top > b10;
                        z11 = z12;
                    }
                    if (photoViewer.z3) {
                        if (imageViewArr[0].getTag() != null && ((Integer) imageViewArr[0].getTag()).intValue() == 3 && z11) {
                            imageViewArr[0].setTag(2);
                            imageViewArr[0].animate().alpha(1.0f).setDuration(150L).setListener(new ay(this, 14)).start();
                        } else if (imageViewArr[0].getTag() == null && !z11) {
                            imageViewArr[0].setTag(3);
                            imageViewArr[0].animate().alpha(0.0f).setListener(null).setDuration(150L).start();
                        }
                    }
                    wo0VarArr[0].e(2, z10 ? 1.0f : 0.0f, true);
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }
}
