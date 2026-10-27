package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class z2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ z2(j4 j4Var, int i10) {
        this.a = i10;
        this.b = j4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArticleViewer$WindowView articleViewer$WindowView;
        org.telegram.ui.Cells.s9 s9Var;
        switch (this.a) {
            case 0:
                j4 j4Var = this.b;
                if (j4Var.K0 && (articleViewer$WindowView = j4Var.f0) != null) {
                    j4Var.K0 = false;
                    if (j4Var.b != null) {
                        try {
                            articleViewer$WindowView.performHapticFeedback(0, 2);
                        } catch (Exception unused) {
                        }
                        j4Var.Z(((org.telegram.ui.Components.v11) j4Var.b.i).b);
                        j4Var.b = null;
                        j4Var.d = null;
                        View view = j4Var.f;
                        if (view != null) {
                            view.invalidate();
                            break;
                        }
                    } else {
                        View view2 = j4Var.f;
                        if (view2 != null && j4Var.P0.f0(view2)) {
                            if (j4Var.f.getTag() == null || j4Var.f.getTag() != "bottomSheet" || (s9Var = j4Var.Q0) == null) {
                                j4Var.P0.l0();
                            } else {
                                s9Var.l0();
                            }
                            if (j4Var.P0.x()) {
                                try {
                                    j4Var.f0.performHapticFeedback(0, 2);
                                    break;
                                } catch (Exception unused2) {
                                    return;
                                }
                            }
                        } else if (j4Var.d != null && j4Var.f != null) {
                            try {
                                j4Var.f0.performHapticFeedback(0, 2);
                            } catch (Exception unused3) {
                            }
                            int[] iArr = new int[2];
                            j4Var.f.getLocationInWindow(iArr);
                            int dp = (iArr[1] + j4Var.e) - AndroidUtilities.dp(54.0f);
                            if (dp < 0) {
                                dp = 0;
                            }
                            j4Var.f.invalidate();
                            j4Var.h = true;
                            View view3 = j4Var.f;
                            org.telegram.ui.ActionBar.o1 o1Var = j4Var.H;
                            if (o1Var == null || !o1Var.isShowing()) {
                                if (j4Var.B0 == null) {
                                    j4Var.D0 = new Rect();
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(j4Var.L, null);
                                    j4Var.B0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                                    j4Var.B0.setBackgroundDrawable(j4Var.L.getResources().getDrawable(R.drawable.menu_copy));
                                    j4Var.B0.setAnimationEnabled(false);
                                    j4Var.B0.setOnTouchListener(new d0(j4Var, 0));
                                    j4Var.B0.setDispatchKeyEventListener(new s(j4Var));
                                    j4Var.B0.setShownFromBottom(false);
                                    TextView textView = new TextView(j4Var.L);
                                    j4Var.C0 = textView;
                                    int i10 = org.telegram.ui.ActionBar.y6.i6;
                                    org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i10, false), 2, -1);
                                    org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
                                    textView.setBackground(g02);
                                    org.telegram.ui.ActionBar.f7.k(textView, g02, null, N, null);
                                    j4Var.C0.setGravity(16);
                                    j4Var.C0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                                    j4Var.C0.setTextSize(1, 15.0f);
                                    j4Var.C0.setTypeface(AndroidUtilities.bold());
                                    j4Var.C0.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                                    j4Var.C0.setOnClickListener(new r(j4Var, 5));
                                    j4Var.B0.addView(j4Var.C0, org.telegram.ui.Components.kb1.g(48.0f, -2));
                                    org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(j4Var.B0, -2, -2);
                                    j4Var.H = o1Var2;
                                    o1Var2.b = false;
                                    o1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                                    j4Var.H.setOutsideTouchable(true);
                                    j4Var.H.setClippingEnabled(true);
                                    j4Var.H.setInputMethodMode(2);
                                    j4Var.H.setSoftInputMode(0);
                                    j4Var.H.getContentView().setFocusableInTouchMode(true);
                                    j4Var.H.setOnDismissListener(new e0(j4Var, 0));
                                }
                                org.telegram.ui.ActionBar.f7.V(j4Var.C0, org.telegram.ui.ActionBar.y6.E8, null);
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = j4Var.B0;
                                if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
                                }
                                j4Var.B0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                                j4Var.H.setFocusable(true);
                                j4Var.H.showAtLocation(view3, 48, 0, dp);
                                j4Var.H.h();
                            } else {
                                j4Var.H.d(true);
                            }
                            j4Var.u0[0].b.setLayoutFrozen(true);
                            j4Var.u0[0].b.setLayoutFrozen(false);
                            break;
                        }
                    }
                }
                break;
            default:
                j4 j4Var2 = this.b;
                if (j4Var2.L0 == null) {
                    j4Var2.L0 = new z2(j4Var2, 0);
                }
                j4Var2.L0.getClass();
                ArticleViewer$WindowView articleViewer$WindowView2 = j4Var2.f0;
                if (articleViewer$WindowView2 != null) {
                    articleViewer$WindowView2.postDelayed(j4Var2.L0, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    break;
                }
                break;
        }
    }
}
