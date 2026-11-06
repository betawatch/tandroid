package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class y2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ y2(g4 g4Var, int i7) {
        this.a = i7;
        this.b = g4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArticleViewer$WindowView articleViewer$WindowView;
        org.telegram.ui.Cells.i9 i9Var;
        int i7 = this.a;
        g4 g4Var = this.b;
        int i10 = 0;
        switch (i7) {
            case 0:
                if (g4Var.K0 && (articleViewer$WindowView = g4Var.f0) != null) {
                    g4Var.K0 = false;
                    if (g4Var.b != null) {
                        try {
                            articleViewer$WindowView.performHapticFeedback(0, 2);
                        } catch (Exception unused) {
                        }
                        g4Var.X(((org.telegram.ui.Components.qy0) g4Var.b.i).b);
                        g4Var.b = null;
                        g4Var.d = null;
                        View view = g4Var.f;
                        if (view != null) {
                            view.invalidate();
                            break;
                        }
                    } else {
                        View view2 = g4Var.f;
                        if (view2 != null && g4Var.P0.f0(view2)) {
                            if (g4Var.f.getTag() == null || g4Var.f.getTag() != "bottomSheet" || (i9Var = g4Var.Q0) == null) {
                                g4Var.P0.l0();
                            } else {
                                i9Var.l0();
                            }
                            if (g4Var.P0.x()) {
                                try {
                                    g4Var.f0.performHapticFeedback(0, 2);
                                    break;
                                } catch (Exception unused2) {
                                    return;
                                }
                            }
                        } else if (g4Var.d != null && g4Var.f != null) {
                            try {
                                g4Var.f0.performHapticFeedback(0, 2);
                            } catch (Exception unused3) {
                            }
                            int[] iArr = new int[2];
                            g4Var.f.getLocationInWindow(iArr);
                            int L = (iArr[1] + g4Var.e) - org.telegram.messenger.g0.L(54.0f);
                            if (L < 0) {
                                L = 0;
                            }
                            g4Var.f.invalidate();
                            g4Var.h = true;
                            View view3 = g4Var.f;
                            org.telegram.ui.ActionBar.g1 g1Var = g4Var.H;
                            if (g1Var == null || !g1Var.isShowing()) {
                                if (g4Var.B0 == null) {
                                    g4Var.D0 = new Rect();
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(g4Var.L, null);
                                    g4Var.B0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                                    g4Var.B0.setBackgroundDrawable(g4Var.L.getResources().getDrawable(R.drawable.menu_copy));
                                    g4Var.B0.setAnimationEnabled(false);
                                    g4Var.B0.setOnTouchListener(new d0(g4Var, 0));
                                    g4Var.B0.setDispatchKeyEventListener(new s(g4Var));
                                    g4Var.B0.setShownFromBottom(false);
                                    TextView textView = new TextView(g4Var.L);
                                    g4Var.C0 = textView;
                                    int i11 = org.telegram.ui.ActionBar.k6.i6;
                                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 2, -1);
                                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
                                    textView.setBackground(h02);
                                    org.telegram.ui.ActionBar.r6.k(textView, h02, null, N, null);
                                    g4Var.C0.setGravity(16);
                                    g4Var.C0.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
                                    g4Var.C0.setTextSize(1, 15.0f);
                                    g4Var.C0.setTypeface(org.telegram.messenger.g0.o());
                                    g4Var.C0.setText(org.telegram.messenger.hd.M0(2131751767, null).toUpperCase());
                                    g4Var.C0.setOnClickListener(new r(g4Var, 5));
                                    g4Var.B0.addView(g4Var.C0, c8.ha.c(48.0f, -2));
                                    org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(g4Var.B0, -2, -2);
                                    g4Var.H = g1Var2;
                                    g1Var2.b = false;
                                    g1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                                    g4Var.H.setOutsideTouchable(true);
                                    g4Var.H.setClippingEnabled(true);
                                    g4Var.H.setInputMethodMode(2);
                                    g4Var.H.setSoftInputMode(0);
                                    g4Var.H.getContentView().setFocusableInTouchMode(true);
                                    g4Var.H.setOnDismissListener(new e0(g4Var, i10));
                                }
                                org.telegram.ui.ActionBar.r6.V(g4Var.C0, org.telegram.ui.ActionBar.k6.E8, null);
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = g4Var.B0;
                                if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
                                }
                                g4Var.B0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                                g4Var.H.setFocusable(true);
                                g4Var.H.showAtLocation(view3, 48, 0, L);
                                g4Var.H.h();
                            } else {
                                g4Var.H.d(true);
                            }
                            g4Var.u0[0].b.setLayoutFrozen(true);
                            g4Var.u0[0].b.setLayoutFrozen(false);
                            break;
                        }
                    }
                }
                break;
            default:
                if (g4Var.L0 == null) {
                    g4Var.L0 = new y2(g4Var, i10);
                }
                g4Var.L0.getClass();
                ArticleViewer$WindowView articleViewer$WindowView2 = g4Var.f0;
                if (articleViewer$WindowView2 != null) {
                    articleViewer$WindowView2.postDelayed(g4Var.L0, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    break;
                }
                break;
        }
    }
}
