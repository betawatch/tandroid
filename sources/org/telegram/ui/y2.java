package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4 b;

    public /* synthetic */ y2(h4 h4Var, int i10) {
        this.a = i10;
        this.b = h4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArticleViewer$WindowView articleViewer$WindowView;
        org.telegram.ui.Cells.k9 k9Var;
        int i10 = this.a;
        h4 h4Var = this.b;
        int i11 = 0;
        switch (i10) {
            case 0:
                if (h4Var.K0 && (articleViewer$WindowView = h4Var.f0) != null) {
                    h4Var.K0 = false;
                    if (h4Var.b != null) {
                        try {
                            articleViewer$WindowView.performHapticFeedback(0, 2);
                        } catch (Exception unused) {
                        }
                        h4Var.X(((org.telegram.ui.Components.uz0) h4Var.b.i).b);
                        h4Var.b = null;
                        h4Var.d = null;
                        View view = h4Var.f;
                        if (view != null) {
                            view.invalidate();
                            break;
                        }
                    } else {
                        View view2 = h4Var.f;
                        if (view2 != null && h4Var.P0.f0(view2)) {
                            if (h4Var.f.getTag() == null || h4Var.f.getTag() != "bottomSheet" || (k9Var = h4Var.Q0) == null) {
                                h4Var.P0.l0();
                            } else {
                                k9Var.l0();
                            }
                            if (h4Var.P0.x()) {
                                try {
                                    h4Var.f0.performHapticFeedback(0, 2);
                                    break;
                                } catch (Exception unused2) {
                                    return;
                                }
                            }
                        } else if (h4Var.d != null && h4Var.f != null) {
                            try {
                                h4Var.f0.performHapticFeedback(0, 2);
                            } catch (Exception unused3) {
                            }
                            int[] iArr = new int[2];
                            h4Var.f.getLocationInWindow(iArr);
                            int L = (iArr[1] + h4Var.e) - org.telegram.messenger.i0.L(54.0f);
                            if (L < 0) {
                                L = 0;
                            }
                            h4Var.f.invalidate();
                            h4Var.h = true;
                            View view3 = h4Var.f;
                            org.telegram.ui.ActionBar.k1 k1Var = h4Var.H;
                            if (k1Var == null || !k1Var.isShowing()) {
                                if (h4Var.B0 == null) {
                                    h4Var.D0 = new Rect();
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(h4Var.L, null);
                                    h4Var.B0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f));
                                    h4Var.B0.setBackgroundDrawable(h4Var.L.getResources().getDrawable(R.drawable.menu_copy));
                                    h4Var.B0.setAnimationEnabled(false);
                                    h4Var.B0.setOnTouchListener(new d0(h4Var, 0));
                                    h4Var.B0.setDispatchKeyEventListener(new r(h4Var));
                                    h4Var.B0.setShownFromBottom(false);
                                    TextView textView = new TextView(h4Var.L);
                                    h4Var.C0 = textView;
                                    int i12 = org.telegram.ui.ActionBar.t6.i6;
                                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 2, -1);
                                    org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
                                    textView.setBackground(h02);
                                    org.telegram.ui.ActionBar.a7.k(textView, h02, null, N, null);
                                    h4Var.C0.setGravity(16);
                                    h4Var.C0.setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(20.0f), 0);
                                    h4Var.C0.setTextSize(1, 15.0f);
                                    h4Var.C0.setTypeface(org.telegram.messenger.i0.o());
                                    h4Var.C0.setText(org.telegram.messenger.cd.L0(2131751767, null).toUpperCase());
                                    h4Var.C0.setOnClickListener(new q(h4Var, 5));
                                    h4Var.B0.addView(h4Var.C0, w7.b6.c(48.0f, -2));
                                    org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(h4Var.B0, -2, -2);
                                    h4Var.H = k1Var2;
                                    k1Var2.b = false;
                                    k1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                                    h4Var.H.setOutsideTouchable(true);
                                    h4Var.H.setClippingEnabled(true);
                                    h4Var.H.setInputMethodMode(2);
                                    h4Var.H.setSoftInputMode(0);
                                    h4Var.H.getContentView().setFocusableInTouchMode(true);
                                    h4Var.H.setOnDismissListener(new e0(h4Var, i11));
                                }
                                org.telegram.ui.ActionBar.a7.V(h4Var.C0, org.telegram.ui.ActionBar.t6.E8, null);
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = h4Var.B0;
                                if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
                                }
                                h4Var.B0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
                                h4Var.H.setFocusable(true);
                                h4Var.H.showAtLocation(view3, 48, 0, L);
                                h4Var.H.h();
                            } else {
                                h4Var.H.d(true);
                            }
                            h4Var.u0[0].b.setLayoutFrozen(true);
                            h4Var.u0[0].b.setLayoutFrozen(false);
                            break;
                        }
                    }
                }
                break;
            default:
                if (h4Var.L0 == null) {
                    h4Var.L0 = new y2(h4Var, i11);
                }
                h4Var.L0.getClass();
                ArticleViewer$WindowView articleViewer$WindowView2 = h4Var.f0;
                if (articleViewer$WindowView2 != null) {
                    articleViewer$WindowView2.postDelayed(h4Var.L0, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    break;
                }
                break;
        }
    }
}
