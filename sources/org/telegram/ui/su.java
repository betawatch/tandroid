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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class su extends cg.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ su(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        switch (this.d) {
            case 0:
                pu puVar = (pu) ((uu) this.e).Z2.get(m1Var.b());
                int i10 = puVar.a;
                if (i10 == 5 || (i10 == 2 && puVar.h != -1)) {
                }
                break;
            default:
                int i11 = m1Var.f;
                if (i11 == 4 || i11 == 3 || i11 == 5) {
                }
                break;
        }
        return true;
    }

    @Override // f2.p0
    public final int h() {
        switch (this.d) {
            case 0:
                return ((uu) this.e).Z2.size();
            default:
                return ((fc0) this.e).s.size();
        }
    }

    @Override // f2.p0
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((pu) ((uu) this.e).Z2.get(i10)).a;
            default:
                fc0 fc0Var = (fc0) this.e;
                if (i10 < 0 || i10 >= fc0Var.s.size()) {
                    return 2;
                }
                return ((zb0) fc0Var.s.get(i10)).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0218  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.m1 m1Var, int i10) {
        Boolean bool;
        float f10;
        switch (this.d) {
            case 0:
                uu uuVar = (uu) this.e;
                ArrayList arrayList = uuVar.Z2;
                int b10 = m1Var.b();
                View view = m1Var.a;
                pu puVar = (pu) arrayList.get(b10);
                int i11 = m1Var.f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 5) {
                                        if (i11 == 6) {
                                            ((wu) view).setTop(true);
                                            break;
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.o8) view).i(puVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.m4) view).setText(puVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.a9) view).setText(puVar.f);
                                break;
                            }
                        } else {
                            nu nuVar = (nu) view;
                            int i12 = puVar.d;
                            int i13 = puVar.e;
                            int i14 = puVar.c;
                            CharSequence charSequence = puVar.f;
                            CharSequence charSequence2 = puVar.g;
                            int i15 = i10 + 1;
                            boolean z4 = i15 < h() && ((pu) arrayList.get(i15)).a == i11;
                            ImageView imageView = nuVar.a;
                            if (i14 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
                                org.telegram.ui.Components.tb0 tb0Var = new org.telegram.ui.Components.tb0(1);
                                tb0Var.b(i12, i13);
                                tb0Var.b = q10;
                                imageView.setBackground(tb0Var);
                                imageView.setImageResource(i14);
                            }
                            nuVar.b.setText(charSequence);
                            nuVar.d.setText(charSequence2);
                            nuVar.e = z4;
                            nuVar.setWillNotDraw(!z4);
                            int i16 = puVar.h;
                            if (i16 >= 0) {
                                tu[] tuVarArr = uuVar.d3;
                                if (i16 >= tuVarArr.length || tuVarArr[i16].c > 0) {
                                    bool = Boolean.valueOf(uuVar.f3[i16]);
                                    ImageView imageView2 = nuVar.c;
                                    if (bool == null) {
                                        imageView2.setVisibility(0);
                                        imageView2.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(org.telegram.ui.Components.pr.h).start();
                                        break;
                                    } else {
                                        imageView2.setVisibility(8);
                                        break;
                                    }
                                }
                            }
                            bool = null;
                            ImageView imageView22 = nuVar.c;
                            if (bool == null) {
                            }
                        }
                    } else {
                        ((xu) view).a.setText(puVar.f);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.wc wcVar = (org.telegram.ui.Components.wc) view;
                    if (uuVar.d3 != null) {
                        wcVar.f(uuVar.g3, uuVar.U2, uuVar.e3);
                    }
                    uuVar.U2 = false;
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((fc0) this.e).s;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    zb0 zb0Var = (zb0) arrayList2.get(i10);
                    int i17 = m1Var.f;
                    View view2 = m1Var.a;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3 && i17 != 4) {
                                    if (i17 == 5) {
                                        org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view2;
                                        if (zb0Var.f == 1) {
                                            o8Var.j(zb0Var.c, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i18 = i10 + 1;
                                    boolean z10 = i18 < arrayList2.size() && ((zb0) arrayList2.get(i18)).a != 2;
                                    ec0 ec0Var = (ec0) view2;
                                    Switch r32 = ec0Var.f;
                                    ImageView imageView3 = ec0Var.e;
                                    org.telegram.ui.Components.k6 k6Var = ec0Var.d;
                                    ImageView imageView4 = ec0Var.a;
                                    org.telegram.ui.Components.np npVar = ec0Var.h;
                                    hg.q qVar = ec0Var.c;
                                    int i19 = zb0Var.a;
                                    CharSequence charSequence3 = zb0Var.c;
                                    int i20 = zb0Var.e;
                                    if (i19 == 3) {
                                        npVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(zb0Var.d);
                                        qVar.setText(charSequence3);
                                        boolean z11 = Integer.bitCount(i20) > 1;
                                        ec0Var.v = z11;
                                        if (z11) {
                                            ec0Var.c(zb0Var, false);
                                            k6Var.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            k6Var.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        qVar.setTranslationX(0.0f);
                                        r32.setVisibility(0);
                                        r32.c(LiteMode.isEnabled(i20), false);
                                        ec0Var.r = Integer.bitCount(i20) > 1;
                                    } else {
                                        npVar.setVisibility(0);
                                        npVar.a(LiteMode.isEnabled(i20), false);
                                        imageView4.setVisibility(8);
                                        r32.setVisibility(8);
                                        k6Var.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        qVar.setText(charSequence3);
                                        qVar.setTranslationX(AndroidUtilities.dp(41.0f) * (LocaleController.isRTL ? -2.2f : 1.0f));
                                        ec0Var.v = false;
                                        ec0Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ec0Var.b.getLayoutParams();
                                    if (zb0Var.a == 3) {
                                        f10 = (LocaleController.isRTL ? 64 : 75) + 4;
                                    } else {
                                        f10 = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(f10);
                                    ec0Var.n = z10;
                                    ec0Var.setWillNotDraw((z10 || ec0Var.r) ? false : true);
                                    ec0Var.b(LiteMode.isPowerSaverApplied(), false);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view2;
                                CharSequence charSequence4 = zb0Var.c;
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
                            ((dc0) view2).a();
                            break;
                        }
                    } else {
                        ((org.telegram.ui.Cells.m4) view2).setText(zb0Var.c);
                        break;
                    }
                }
                break;
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11 = this.d;
        View view2 = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                uu uuVar = (uu) obj;
                yu yuVar = uuVar.l3;
                org.telegram.ui.ActionBar.g6 g6Var = uuVar.m2;
                if (i10 == 0) {
                    Context context = uuVar.getContext();
                    int[] iArr = yu.e;
                    ru ruVar = new ru(this, context, iArr.length, iArr, yu.f);
                    uuVar.k3 = ruVar;
                    ruVar.setInterceptTouch(false);
                    View view3 = uuVar.k3;
                    view3.setTag(-33024);
                    view = view3;
                } else if (i10 == 1) {
                    Context context2 = uuVar.getContext();
                    xu xuVar = new xu(context2);
                    TextView textView = new TextView(context2);
                    xuVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(yuVar.getThemedColor(org.telegram.ui.ActionBar.k6.y6));
                    xuVar.addView(textView, k7.c6.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                    xuVar.setTag(-33024);
                    view = xuVar;
                } else if (i10 == 3) {
                    view = new org.telegram.ui.Cells.a9(uuVar.getContext());
                } else if (i10 == 4) {
                    View m4Var = new org.telegram.ui.Cells.m4(uuVar.getContext());
                    m4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, g6Var));
                    view = m4Var;
                } else if (i10 == 5) {
                    org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(uuVar.getContext());
                    o8Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.p7, g6Var));
                    o8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, g6Var));
                    view = o8Var;
                } else if (i10 == 6) {
                    wu wuVar = new wu(uuVar.getContext());
                    wuVar.a = new Path();
                    Paint paint = new Paint(1);
                    wuVar.b = paint;
                    wuVar.c = true;
                    paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                    view = wuVar;
                } else if (i10 != 7) {
                    view = new nu(yuVar, uuVar.getContext());
                } else {
                    View jnVar = new org.telegram.ui.Components.jn(uuVar.getContext(), 11);
                    int i12 = org.telegram.ui.ActionBar.k6.d6;
                    int i13 = uu.m3;
                    jnVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i12, uuVar.m2));
                    view = jnVar;
                }
                return new org.telegram.ui.Components.fl0(view);
            default:
                fc0 fc0Var = (fc0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view2 = new org.telegram.ui.Cells.m4(context3);
                } else if (i10 == 1) {
                    view2 = new dc0(fc0Var, context3);
                } else if (i10 == 2) {
                    view2 = new yb0(context3);
                } else if (i10 == 3 || i10 == 4) {
                    view2 = new ec0(fc0Var, context3);
                } else if (i10 == 5) {
                    view2 = new org.telegram.ui.Cells.o8(23, context3, null, false, true);
                }
                return new org.telegram.ui.Components.fl0(view2);
        }
    }
}
