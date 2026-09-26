package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class zv0 extends org.telegram.ui.Components.n81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zv0(Object obj, Context context, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ActionBar.m2 m2Var;
        t5 t5Var;
        int i12 = this.a;
        Object obj = this.c;
        switch (i12) {
            case 0:
                break;
            case 1:
                ((s31) view).a(i11);
                break;
            case 2:
                break;
            case 3:
                th1 th1Var = (th1) obj;
                SparseArray sparseArray = th1Var.a;
                rh1 rh1Var = (rh1) sparseArray.get(i10);
                if (rh1Var != null) {
                    m2Var = rh1Var.a;
                } else {
                    org.telegram.ui.ActionBar.m2 V = th1Var.V(i10);
                    rh1 rh1Var2 = new rh1(V);
                    sparseArray.put(i10, rh1Var2);
                    m2Var = V;
                    rh1Var = rh1Var2;
                }
                if (!rh1Var.b) {
                    m2Var.onFragmentCreate();
                    rh1Var.b = true;
                }
                m2Var.setParentLayout(th1Var.getParentLayout());
                if (m2Var.getFragmentView() == null) {
                    m2Var.performCreateView((Context) this.b);
                    m2Var.setTitleOverlayText(th1Var.n, th1Var.r, th1Var.s);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                View fragmentView = m2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!m2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                }
                frameLayout.addView(fragmentView, w7.y5.c(-1.0f, -1));
                if (m2Var.getActionBar() != null && m2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(m2Var.getActionBar());
                    frameLayout.addView(m2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.a;
                r0.y.c(frameLayout);
                th1Var.checkSystemBarColors();
                th1Var.U();
                break;
            case 4:
                break;
            default:
                yh.x3 x3Var = (yh.x3) obj;
                if (i11 == 0) {
                    yh.x3.j1(x3Var, false);
                    xh.n2 n2Var = x3Var.b0;
                    if (n2Var != null) {
                        t5Var = n2Var.Y;
                    }
                } else if (i11 == 2) {
                    yh.x3.j1(x3Var, true);
                    xh.n2 n2Var2 = x3Var.c0;
                    if (n2Var2 != null) {
                        t5Var = n2Var2.Y;
                    }
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                AndroidUtilities.removeFromParent(t5Var);
                frameLayout2.addView(t5Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        t5 t5Var;
        switch (this.a) {
            case 0:
                FrameLayout frameLayout = new FrameLayout((Context) this.b);
                frameLayout.setOnClickListener(new f60(this, 23));
                return frameLayout;
            case 1:
                return new s31((t31) this.c, (Context) this.b);
            case 2:
                FrameLayout frameLayout2 = new FrameLayout((Context) this.b);
                frameLayout2.setOnClickListener(new y31(this, 7));
                return frameLayout2;
            case 3:
                return new m51((Context) this.b, 7);
            case 4:
                return i10 == 0 ? ((tg.a0) this.b).getContainerView() : ((tg.z0) this.c).getContainerView();
            default:
                yh.x3 x3Var = (yh.x3) this.c;
                if (i10 == 0) {
                    yh.x3.j1(x3Var, false);
                    xh.n2 n2Var = x3Var.b0;
                    if (n2Var != null) {
                        t5Var = n2Var.Y;
                        AndroidUtilities.removeFromParent(t5Var);
                        FrameLayout frameLayout3 = new FrameLayout((Context) this.b);
                        frameLayout3.addView(t5Var, w7.y5.e(-1, -1, 119));
                        return frameLayout3;
                    }
                    return null;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        yh.x3.j1(x3Var, true);
                        xh.n2 n2Var2 = x3Var.c0;
                        if (n2Var2 != null) {
                            t5Var = n2Var2.Y;
                        }
                    }
                    return null;
                }
                t5Var = x3Var.Y;
                AndroidUtilities.removeFromParent(t5Var);
                FrameLayout frameLayout32 = new FrameLayout((Context) this.b);
                frameLayout32.addView(t5Var, w7.y5.e(-1, -1, 119));
                return frameLayout32;
        }
    }

    @Override // org.telegram.ui.Components.n81
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            case 1:
                return 5;
            case 2:
                return 2;
            case 3:
                ((th1) this.c).getClass();
                return 4;
            case 4:
                return 2;
            default:
                yh.x3 x3Var = (yh.x3) this.c;
                return (x3Var.L1(true) ? 1 : 0) + (x3Var.L1(false) ? 1 : 0) + 1;
        }
    }

    @Override // org.telegram.ui.Components.n81
    public int h(int i10) {
        switch (this.a) {
            case 1:
                return i10 == 0 ? 0 : 1;
            case 2:
            case 3:
            default:
                return super.h(i10);
            case 4:
                return i10;
            case 5:
                return (i10 - (((yh.x3) this.c).L1(false) ? 1 : 0)) + 1;
        }
    }

    public zv0(tg.a0 a0Var, tg.z0 z0Var) {
        this.a = 4;
        this.b = a0Var;
        this.c = z0Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
