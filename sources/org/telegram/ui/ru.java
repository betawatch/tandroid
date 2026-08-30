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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ru extends bg.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ru(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        switch (this.d) {
            case 0:
                ou ouVar = (ou) ((tu) this.e).Z2.get(l1Var.b());
                int i10 = ouVar.a;
                if (i10 == 5 || (i10 == 2 && ouVar.h != -1)) {
                }
                break;
            default:
                int i11 = l1Var.f;
                if (i11 == 4 || i11 == 3 || i11 == 5) {
                }
                break;
        }
        return true;
    }

    @Override // f2.o0
    public final int h() {
        switch (this.d) {
            case 0:
                return ((tu) this.e).Z2.size();
            default:
                return ((ec0) this.e).s.size();
        }
    }

    @Override // f2.o0
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((ou) ((tu) this.e).Z2.get(i10)).a;
            default:
                ec0 ec0Var = (ec0) this.e;
                if (i10 < 0 || i10 >= ec0Var.s.size()) {
                    return 2;
                }
                return ((yb0) ec0Var.s.get(i10)).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0218  */
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
        Boolean bool;
        float f10;
        switch (this.d) {
            case 0:
                tu tuVar = (tu) this.e;
                ArrayList arrayList = tuVar.Z2;
                int b10 = l1Var.b();
                View view = l1Var.a;
                ou ouVar = (ou) arrayList.get(b10);
                int i11 = l1Var.f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 5) {
                                        if (i11 == 6) {
                                            ((vu) view).setTop(true);
                                            break;
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.o8) view).i(ouVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.m4) view).setText(ouVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.a9) view).setText(ouVar.f);
                                break;
                            }
                        } else {
                            mu muVar = (mu) view;
                            int i12 = ouVar.d;
                            int i13 = ouVar.e;
                            int i14 = ouVar.c;
                            CharSequence charSequence = ouVar.f;
                            CharSequence charSequence2 = ouVar.g;
                            int i15 = i10 + 1;
                            boolean z4 = i15 < h() && ((ou) arrayList.get(i15)).a == i11;
                            ImageView imageView = muVar.a;
                            if (i14 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
                                org.telegram.ui.Components.rb0 rb0Var = new org.telegram.ui.Components.rb0(1);
                                rb0Var.b(i12, i13);
                                rb0Var.b = q10;
                                imageView.setBackground(rb0Var);
                                imageView.setImageResource(i14);
                            }
                            muVar.b.setText(charSequence);
                            muVar.d.setText(charSequence2);
                            muVar.e = z4;
                            muVar.setWillNotDraw(!z4);
                            int i16 = ouVar.h;
                            if (i16 >= 0) {
                                su[] suVarArr = tuVar.d3;
                                if (i16 >= suVarArr.length || suVarArr[i16].c > 0) {
                                    bool = Boolean.valueOf(tuVar.f3[i16]);
                                    ImageView imageView2 = muVar.c;
                                    if (bool == null) {
                                        imageView2.setVisibility(0);
                                        imageView2.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(org.telegram.ui.Components.nr.h).start();
                                        break;
                                    } else {
                                        imageView2.setVisibility(8);
                                        break;
                                    }
                                }
                            }
                            bool = null;
                            ImageView imageView22 = muVar.c;
                            if (bool == null) {
                            }
                        }
                    } else {
                        ((wu) view).a.setText(ouVar.f);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.wc wcVar = (org.telegram.ui.Components.wc) view;
                    if (tuVar.d3 != null) {
                        wcVar.f(tuVar.g3, tuVar.U2, tuVar.e3);
                    }
                    tuVar.U2 = false;
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((ec0) this.e).s;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    yb0 yb0Var = (yb0) arrayList2.get(i10);
                    int i17 = l1Var.f;
                    View view2 = l1Var.a;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3 && i17 != 4) {
                                    if (i17 == 5) {
                                        org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view2;
                                        if (yb0Var.f == 1) {
                                            o8Var.j(yb0Var.c, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i18 = i10 + 1;
                                    boolean z10 = i18 < arrayList2.size() && ((yb0) arrayList2.get(i18)).a != 2;
                                    dc0 dc0Var = (dc0) view2;
                                    Switch r32 = dc0Var.f;
                                    ImageView imageView3 = dc0Var.e;
                                    org.telegram.ui.Components.k6 k6Var = dc0Var.d;
                                    ImageView imageView4 = dc0Var.a;
                                    org.telegram.ui.Components.lp lpVar = dc0Var.h;
                                    gg.q qVar = dc0Var.c;
                                    int i19 = yb0Var.a;
                                    CharSequence charSequence3 = yb0Var.c;
                                    int i20 = yb0Var.e;
                                    if (i19 == 3) {
                                        lpVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(yb0Var.d);
                                        qVar.setText(charSequence3);
                                        boolean z11 = Integer.bitCount(i20) > 1;
                                        dc0Var.v = z11;
                                        if (z11) {
                                            dc0Var.c(yb0Var, false);
                                            k6Var.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            k6Var.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        qVar.setTranslationX(0.0f);
                                        r32.setVisibility(0);
                                        r32.c(LiteMode.isEnabled(i20), false);
                                        dc0Var.r = Integer.bitCount(i20) > 1;
                                    } else {
                                        lpVar.setVisibility(0);
                                        lpVar.a(LiteMode.isEnabled(i20), false);
                                        imageView4.setVisibility(8);
                                        r32.setVisibility(8);
                                        k6Var.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        qVar.setText(charSequence3);
                                        qVar.setTranslationX(AndroidUtilities.dp(41.0f) * (LocaleController.isRTL ? -2.2f : 1.0f));
                                        dc0Var.v = false;
                                        dc0Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) dc0Var.b.getLayoutParams();
                                    if (yb0Var.a == 3) {
                                        f10 = (LocaleController.isRTL ? 64 : 75) + 4;
                                    } else {
                                        f10 = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(f10);
                                    dc0Var.n = z10;
                                    dc0Var.setWillNotDraw((z10 || dc0Var.r) ? false : true);
                                    dc0Var.b(LiteMode.isPowerSaverApplied(), false);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view2;
                                CharSequence charSequence4 = yb0Var.c;
                                if (TextUtils.isEmpty(charSequence4)) {
                                    a9Var.setFixedSize(12);
                                } else {
                                    a9Var.setFixedSize(0);
                                }
                                a9Var.setText(charSequence4);
                                a9Var.setContentDescription(charSequence4);
                                a9Var.setBackground(null);
                                break;
                            }
                        } else {
                            ((cc0) view2).a();
                            break;
                        }
                    } else {
                        ((org.telegram.ui.Cells.m4) view2).setText(yb0Var.c);
                        break;
                    }
                }
                break;
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11 = this.d;
        View view2 = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                tu tuVar = (tu) obj;
                xu xuVar = tuVar.l3;
                org.telegram.ui.ActionBar.f6 f6Var = tuVar.m2;
                if (i10 == 0) {
                    Context context = tuVar.getContext();
                    int[] iArr = xu.e;
                    qu quVar = new qu(this, context, iArr.length, iArr, xu.f);
                    tuVar.k3 = quVar;
                    quVar.setInterceptTouch(false);
                    View view3 = tuVar.k3;
                    view3.setTag(-33024);
                    view = view3;
                } else if (i10 == 1) {
                    Context context2 = tuVar.getContext();
                    wu wuVar = new wu(context2);
                    TextView textView = new TextView(context2);
                    wuVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(xuVar.getThemedColor(org.telegram.ui.ActionBar.j6.y6));
                    wuVar.addView(textView, k7.b6.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                    wuVar.setTag(-33024);
                    view = wuVar;
                } else if (i10 == 3) {
                    view = new org.telegram.ui.Cells.a9(tuVar.getContext());
                } else if (i10 == 4) {
                    View m4Var = new org.telegram.ui.Cells.m4(tuVar.getContext());
                    m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
                    view = m4Var;
                } else if (i10 == 5) {
                    org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(tuVar.getContext());
                    o8Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, f6Var));
                    o8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
                    view = o8Var;
                } else if (i10 == 6) {
                    vu vuVar = new vu(tuVar.getContext());
                    vuVar.a = new Path();
                    Paint paint = new Paint(1);
                    vuVar.b = paint;
                    vuVar.c = true;
                    paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    view = vuVar;
                } else if (i10 != 7) {
                    view = new mu(xuVar, tuVar.getContext());
                } else {
                    View hnVar = new org.telegram.ui.Components.hn(tuVar.getContext(), 11);
                    int i12 = org.telegram.ui.ActionBar.j6.d6;
                    int i13 = tu.m3;
                    hnVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, tuVar.m2));
                    view = hnVar;
                }
                return new org.telegram.ui.Components.el0(view);
            default:
                ec0 ec0Var = (ec0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view2 = new org.telegram.ui.Cells.m4(context3);
                } else if (i10 == 1) {
                    view2 = new cc0(ec0Var, context3);
                } else if (i10 == 2) {
                    view2 = new xb0(context3);
                } else if (i10 == 3 || i10 == 4) {
                    view2 = new dc0(ec0Var, context3);
                } else if (i10 == 5) {
                    view2 = new org.telegram.ui.Cells.o8(23, context3, null, false, true);
                }
                return new org.telegram.ui.Components.el0(view2);
        }
    }
}
