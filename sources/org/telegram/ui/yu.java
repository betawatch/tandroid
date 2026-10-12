package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class yu extends pg.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        switch (this.d) {
            case 0:
                vu vuVar = (vu) ((av) this.e).a3.get(b1Var.b());
                int i10 = vuVar.a;
                if (i10 == 5 || (i10 == 2 && vuVar.h != -1)) {
                }
                break;
            default:
                int i11 = b1Var.f;
                if (i11 == 4 || i11 == 3 || i11 == 5) {
                }
                break;
        }
        return true;
    }

    @Override // s4.g0
    public final int h() {
        switch (this.d) {
            case 0:
                return ((av) this.e).a3.size();
            default:
                return ((rc0) this.e).s.size();
        }
    }

    @Override // s4.g0
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((vu) ((av) this.e).a3.get(i10)).a;
            default:
                rc0 rc0Var = (rc0) this.e;
                if (i10 < 0 || i10 >= rc0Var.s.size()) {
                    return 2;
                }
                return ((lc0) rc0Var.s.get(i10)).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0217  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        Boolean bool;
        boolean z10;
        float f7;
        switch (this.d) {
            case 0:
                av avVar = (av) this.e;
                ArrayList arrayList = avVar.a3;
                int b10 = b1Var.b();
                View view = b1Var.a;
                vu vuVar = (vu) arrayList.get(b10);
                int i11 = b1Var.f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 5) {
                                        if (i11 == 6) {
                                            ((cv) view).setTop(true);
                                            break;
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.r8) view).i(vuVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.m4) view).setText(vuVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.e9) view).setText(vuVar.f);
                                break;
                            }
                        } else {
                            tu tuVar = (tu) view;
                            int i12 = vuVar.d;
                            int i13 = vuVar.e;
                            int i14 = vuVar.c;
                            CharSequence charSequence = vuVar.f;
                            CharSequence charSequence2 = vuVar.g;
                            int i15 = i10 + 1;
                            boolean z11 = i15 < h() && ((vu) arrayList.get(i15)).a == i11;
                            ImageView imageView = tuVar.a;
                            if (i14 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean q6 = org.telegram.ui.ActionBar.g6.I.q();
                                org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(1);
                                qc0Var.b(i12, i13);
                                qc0Var.b = q6;
                                imageView.setBackground(qc0Var);
                                imageView.setImageResource(i14);
                            }
                            tuVar.b.setText(charSequence);
                            tuVar.d.setText(charSequence2);
                            tuVar.e = z11;
                            tuVar.setWillNotDraw(!z11);
                            int i16 = vuVar.h;
                            if (i16 >= 0) {
                                zu[] zuVarArr = avVar.e3;
                                if (i16 >= zuVarArr.length || zuVarArr[i16].c > 0) {
                                    bool = Boolean.valueOf(avVar.g3[i16]);
                                    ImageView imageView2 = tuVar.c;
                                    if (bool == null) {
                                        imageView2.setVisibility(0);
                                        imageView2.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(org.telegram.ui.Components.es.h).start();
                                        break;
                                    } else {
                                        imageView2.setVisibility(8);
                                        break;
                                    }
                                }
                            }
                            bool = null;
                            ImageView imageView22 = tuVar.c;
                            if (bool == null) {
                            }
                        }
                    } else {
                        ((dv) view).a.setText(vuVar.f);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.fd fdVar = (org.telegram.ui.Components.fd) view;
                    if (avVar.e3 != null) {
                        fdVar.f(avVar.h3, avVar.V2, avVar.f3);
                    }
                    avVar.V2 = false;
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((rc0) this.e).s;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    lc0 lc0Var = (lc0) arrayList2.get(i10);
                    int i17 = b1Var.f;
                    View view2 = b1Var.a;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3 && i17 != 4) {
                                    if (i17 == 5) {
                                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view2;
                                        if (lc0Var.f == 1) {
                                            r8Var.j(lc0Var.c, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i18 = i10 + 1;
                                    boolean z12 = i18 < arrayList2.size() && ((lc0) arrayList2.get(i18)).a != 2;
                                    qc0 qc0Var2 = (qc0) view2;
                                    Switch r32 = qc0Var2.f;
                                    ImageView imageView3 = qc0Var2.e;
                                    org.telegram.ui.Components.s6 s6Var = qc0Var2.d;
                                    ImageView imageView4 = qc0Var2.a;
                                    org.telegram.ui.Components.aq aqVar = qc0Var2.h;
                                    bi.f4 f4Var = qc0Var2.c;
                                    int i19 = lc0Var.a;
                                    CharSequence charSequence3 = lc0Var.c;
                                    int i20 = lc0Var.e;
                                    if (i19 == 3) {
                                        aqVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(lc0Var.d);
                                        f4Var.setText(charSequence3);
                                        boolean z13 = Integer.bitCount(i20) > 1;
                                        qc0Var2.v = z13;
                                        if (z13) {
                                            qc0Var2.c(lc0Var, false);
                                            s6Var.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            s6Var.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        f4Var.setTranslationX(0.0f);
                                        r32.setVisibility(0);
                                        r32.c(LiteMode.isEnabled(i20), false);
                                        z10 = true;
                                        qc0Var2.r = Integer.bitCount(i20) > 1;
                                    } else {
                                        z10 = true;
                                        aqVar.setVisibility(0);
                                        aqVar.a(LiteMode.isEnabled(i20), false);
                                        imageView4.setVisibility(8);
                                        r32.setVisibility(8);
                                        s6Var.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        f4Var.setText(charSequence3);
                                        f4Var.setTranslationX(AndroidUtilities.dp(41.0f) * (LocaleController.isRTL ? -2.2f : 1.0f));
                                        qc0Var2.v = false;
                                        qc0Var2.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qc0Var2.b.getLayoutParams();
                                    if (lc0Var.a == 3) {
                                        f7 = (LocaleController.isRTL ? 64 : 75) + 4;
                                    } else {
                                        f7 = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(f7);
                                    qc0Var2.n = z12;
                                    qc0Var2.setWillNotDraw((z12 || qc0Var2.r) ? false : z10);
                                    qc0Var2.b(LiteMode.isPowerSaverApplied(), false);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view2;
                                CharSequence charSequence4 = lc0Var.c;
                                if (TextUtils.isEmpty(charSequence4)) {
                                    e9Var.setFixedSize(12);
                                } else {
                                    e9Var.setFixedSize(0);
                                }
                                e9Var.setText(charSequence4);
                                e9Var.setContentDescription(charSequence4);
                                e9Var.setBackground(null);
                                break;
                            }
                        } else {
                            ((pc0) view2).a();
                            break;
                        }
                    } else {
                        ((org.telegram.ui.Cells.m4) view2).setText(lc0Var.c);
                        break;
                    }
                }
                break;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11 = this.d;
        View view2 = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                av avVar = (av) obj;
                ev evVar = avVar.m3;
                org.telegram.ui.ActionBar.c6 c6Var = avVar.n2;
                if (i10 == 0) {
                    Context context = avVar.getContext();
                    int[] iArr = ev.e;
                    xu xuVar = new xu(this, context, iArr.length, iArr, ev.f);
                    avVar.l3 = xuVar;
                    xuVar.setInterceptTouch(false);
                    View view3 = avVar.l3;
                    view3.setTag(-33024);
                    view = view3;
                } else if (i10 == 1) {
                    Context context2 = avVar.getContext();
                    dv dvVar = new dv(context2);
                    TextView textView = new TextView(context2);
                    dvVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(evVar.getThemedColor(org.telegram.ui.ActionBar.g6.y6));
                    dvVar.addView(textView, w7.a6.a(-2.0f, 24.0f, 0.0f, 24.0f, 14.0f, -1, 119));
                    dvVar.setTag(-33024);
                    view = dvVar;
                } else if (i10 == 3) {
                    view = new org.telegram.ui.Cells.e9(avVar.getContext());
                } else if (i10 == 4) {
                    View m4Var = new org.telegram.ui.Cells.m4(avVar.getContext());
                    m4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, c6Var));
                    view = m4Var;
                } else if (i10 == 5) {
                    org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(avVar.getContext());
                    r8Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.p7, c6Var));
                    r8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, c6Var));
                    view = r8Var;
                } else if (i10 == 6) {
                    cv cvVar = new cv(avVar.getContext());
                    cvVar.a = new Path();
                    Paint paint = new Paint(1);
                    cvVar.b = paint;
                    cvVar.c = true;
                    paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                    view = cvVar;
                } else if (i10 != 7) {
                    view = new tu(evVar, avVar.getContext());
                } else {
                    View xnVar = new org.telegram.ui.Components.xn(avVar.getContext(), 14);
                    int i12 = org.telegram.ui.ActionBar.g6.d6;
                    int i13 = av.n3;
                    xnVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i12, avVar.n2));
                    view = xnVar;
                }
                return new org.telegram.ui.Components.wl0(view);
            default:
                rc0 rc0Var = (rc0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view2 = new org.telegram.ui.Cells.m4(context3);
                } else if (i10 == 1) {
                    view2 = new pc0(rc0Var, context3);
                } else if (i10 == 2) {
                    view2 = new kc0(context3);
                } else if (i10 == 3 || i10 == 4) {
                    view2 = new qc0(rc0Var, context3);
                } else if (i10 == 5) {
                    view2 = new org.telegram.ui.Cells.r8(23, context3, null, false, true);
                }
                return new org.telegram.ui.Components.wl0(view2);
        }
    }
}
