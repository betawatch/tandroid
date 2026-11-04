package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ z2(i4 i4Var, int i3) {
        this.a = i3;
        this.b = i4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArticleViewer$WindowView articleViewer$WindowView;
        org.telegram.ui.Cells.h9 h9Var;
        int i3 = this.a;
        i4 i4Var = this.b;
        int i10 = 0;
        switch (i3) {
            case 0:
                if (i4Var.L0 && (articleViewer$WindowView = i4Var.g0) != null) {
                    i4Var.L0 = false;
                    if (i4Var.b != null) {
                        try {
                            articleViewer$WindowView.performHapticFeedback(0, 2);
                        } catch (Exception unused) {
                        }
                        i4Var.X(((org.telegram.ui.Components.py0) i4Var.b.i).b);
                        i4Var.b = null;
                        i4Var.d = null;
                        View view = i4Var.f;
                        if (view != null) {
                            view.invalidate();
                            break;
                        }
                    } else {
                        View view2 = i4Var.f;
                        if (view2 != null && i4Var.Q0.f0(view2)) {
                            if (i4Var.f.getTag() == null || i4Var.f.getTag() != "bottomSheet" || (h9Var = i4Var.R0) == null) {
                                i4Var.Q0.l0();
                            } else {
                                h9Var.l0();
                            }
                            if (i4Var.Q0.x()) {
                                try {
                                    i4Var.g0.performHapticFeedback(0, 2);
                                    break;
                                } catch (Exception unused2) {
                                    return;
                                }
                            }
                        } else if (i4Var.d != null && i4Var.f != null) {
                            try {
                                i4Var.g0.performHapticFeedback(0, 2);
                            } catch (Exception unused3) {
                            }
                            int[] iArr = new int[2];
                            i4Var.f.getLocationInWindow(iArr);
                            int L = (iArr[1] + i4Var.e) - org.telegram.messenger.g0.L(54.0f);
                            if (L < 0) {
                                L = 0;
                            }
                            i4Var.f.invalidate();
                            i4Var.h = true;
                            View view3 = i4Var.f;
                            org.telegram.ui.ActionBar.f1 f1Var = i4Var.I;
                            if (f1Var == null || !f1Var.isShowing()) {
                                if (i4Var.C0 == null) {
                                    i4Var.E0 = new Rect();
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i4Var.M, null);
                                    i4Var.C0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                                    i4Var.C0.setBackgroundDrawable(i4Var.M.getResources().getDrawable(R.drawable.menu_copy));
                                    i4Var.C0.setAnimationEnabled(false);
                                    i4Var.C0.setOnTouchListener(new e0(i4Var, 0));
                                    i4Var.C0.setDispatchKeyEventListener(new s(i4Var));
                                    i4Var.C0.setShownFromBottom(false);
                                    TextView textView = new TextView(i4Var.M);
                                    i4Var.D0 = textView;
                                    int i11 = org.telegram.ui.ActionBar.k6.i6;
                                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 2, -1);
                                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
                                    textView.setBackground(h02);
                                    org.telegram.ui.ActionBar.r6.k(textView, h02, null, N, null);
                                    i4Var.D0.setGravity(16);
                                    i4Var.D0.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
                                    i4Var.D0.setTextSize(1, 15.0f);
                                    i4Var.D0.setTypeface(org.telegram.messenger.g0.o());
                                    i4Var.D0.setText(org.telegram.messenger.bd.M0(2131751767, null).toUpperCase());
                                    i4Var.D0.setOnClickListener(new r(i4Var, 5));
                                    i4Var.C0.addView(i4Var.D0, b8.mf.c(48.0f, -2));
                                    org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(i4Var.C0, -2, -2);
                                    i4Var.I = f1Var2;
                                    f1Var2.b = false;
                                    f1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                                    i4Var.I.setOutsideTouchable(true);
                                    i4Var.I.setClippingEnabled(true);
                                    i4Var.I.setInputMethodMode(2);
                                    i4Var.I.setSoftInputMode(0);
                                    i4Var.I.getContentView().setFocusableInTouchMode(true);
                                    i4Var.I.setOnDismissListener(new f0(i4Var, i10));
                                }
                                org.telegram.ui.ActionBar.r6.V(i4Var.D0, org.telegram.ui.ActionBar.k6.E8, null);
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = i4Var.C0;
                                if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
                                }
                                i4Var.C0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                                i4Var.I.setFocusable(true);
                                i4Var.I.showAtLocation(view3, 48, 0, L);
                                i4Var.I.h();
                            } else {
                                i4Var.I.d(true);
                            }
                            i4Var.v0[0].b.setLayoutFrozen(true);
                            i4Var.v0[0].b.setLayoutFrozen(false);
                            break;
                        }
                    }
                }
                break;
            default:
                if (i4Var.M0 == null) {
                    i4Var.M0 = new z2(i4Var, i10);
                }
                i4Var.M0.getClass();
                ArticleViewer$WindowView articleViewer$WindowView2 = i4Var.g0;
                if (articleViewer$WindowView2 != null) {
                    articleViewer$WindowView2.postDelayed(i4Var.M0, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    break;
                }
                break;
        }
    }
}
