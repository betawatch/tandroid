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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class tu extends bg.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        switch (this.d) {
            case 0:
                qu quVar = (qu) ((vu) this.e).Z2.get(l1Var.b());
                int i10 = quVar.a;
                if (i10 == 5 || (i10 == 2 && quVar.h != -1)) {
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
                return ((vu) this.e).Z2.size();
            default:
                return ((gc0) this.e).s.size();
        }
    }

    @Override // f2.o0
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((qu) ((vu) this.e).Z2.get(i10)).a;
            default:
                gc0 gc0Var = (gc0) this.e;
                if (i10 < 0 || i10 >= gc0Var.s.size()) {
                    return 2;
                }
                return ((ac0) gc0Var.s.get(i10)).a;
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
                vu vuVar = (vu) this.e;
                ArrayList arrayList = vuVar.Z2;
                int b10 = l1Var.b();
                View view = l1Var.a;
                qu quVar = (qu) arrayList.get(b10);
                int i11 = l1Var.f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 5) {
                                        if (i11 == 6) {
                                            ((xu) view).setTop(true);
                                            break;
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.n8) view).i(quVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.l4) view).setText(quVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.z8) view).setText(quVar.f);
                                break;
                            }
                        } else {
                            ou ouVar = (ou) view;
                            int i12 = quVar.d;
                            int i13 = quVar.e;
                            int i14 = quVar.c;
                            CharSequence charSequence = quVar.f;
                            CharSequence charSequence2 = quVar.g;
                            int i15 = i10 + 1;
                            boolean z4 = i15 < h() && ((qu) arrayList.get(i15)).a == i11;
                            ImageView imageView = ouVar.a;
                            if (i14 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
                                org.telegram.ui.Components.sb0 sb0Var = new org.telegram.ui.Components.sb0(1);
                                sb0Var.b(i12, i13);
                                sb0Var.b = q10;
                                imageView.setBackground(sb0Var);
                                imageView.setImageResource(i14);
                            }
                            ouVar.b.setText(charSequence);
                            ouVar.d.setText(charSequence2);
                            ouVar.e = z4;
                            ouVar.setWillNotDraw(!z4);
                            int i16 = quVar.h;
                            if (i16 >= 0) {
                                uu[] uuVarArr = vuVar.d3;
                                if (i16 >= uuVarArr.length || uuVarArr[i16].c > 0) {
                                    bool = Boolean.valueOf(vuVar.f3[i16]);
                                    ImageView imageView2 = ouVar.c;
                                    if (bool == null) {
                                        imageView2.setVisibility(0);
                                        imageView2.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(org.telegram.ui.Components.mr.h).start();
                                        break;
                                    } else {
                                        imageView2.setVisibility(8);
                                        break;
                                    }
                                }
                            }
                            bool = null;
                            ImageView imageView22 = ouVar.c;
                            if (bool == null) {
                            }
                        }
                    } else {
                        ((yu) view).a.setText(quVar.f);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.wc wcVar = (org.telegram.ui.Components.wc) view;
                    if (vuVar.d3 != null) {
                        wcVar.f(vuVar.g3, vuVar.U2, vuVar.e3);
                    }
                    vuVar.U2 = false;
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((gc0) this.e).s;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    ac0 ac0Var = (ac0) arrayList2.get(i10);
                    int i17 = l1Var.f;
                    View view2 = l1Var.a;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3 && i17 != 4) {
                                    if (i17 == 5) {
                                        org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view2;
                                        if (ac0Var.f == 1) {
                                            n8Var.j(ac0Var.c, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i18 = i10 + 1;
                                    boolean z10 = i18 < arrayList2.size() && ((ac0) arrayList2.get(i18)).a != 2;
                                    fc0 fc0Var = (fc0) view2;
                                    Switch r32 = fc0Var.f;
                                    ImageView imageView3 = fc0Var.e;
                                    org.telegram.ui.Components.k6 k6Var = fc0Var.d;
                                    ImageView imageView4 = fc0Var.a;
                                    org.telegram.ui.Components.kp kpVar = fc0Var.h;
                                    gg.q qVar = fc0Var.c;
                                    int i19 = ac0Var.a;
                                    CharSequence charSequence3 = ac0Var.c;
                                    int i20 = ac0Var.e;
                                    if (i19 == 3) {
                                        kpVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(ac0Var.d);
                                        qVar.setText(charSequence3);
                                        boolean z11 = Integer.bitCount(i20) > 1;
                                        fc0Var.v = z11;
                                        if (z11) {
                                            fc0Var.c(ac0Var, false);
                                            k6Var.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            k6Var.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        qVar.setTranslationX(0.0f);
                                        r32.setVisibility(0);
                                        r32.c(LiteMode.isEnabled(i20), false);
                                        fc0Var.r = Integer.bitCount(i20) > 1;
                                    } else {
                                        kpVar.setVisibility(0);
                                        kpVar.a(LiteMode.isEnabled(i20), false);
                                        imageView4.setVisibility(8);
                                        r32.setVisibility(8);
                                        k6Var.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        qVar.setText(charSequence3);
                                        qVar.setTranslationX(AndroidUtilities.dp(41.0f) * (LocaleController.isRTL ? -2.2f : 1.0f));
                                        fc0Var.v = false;
                                        fc0Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fc0Var.b.getLayoutParams();
                                    if (ac0Var.a == 3) {
                                        f10 = (LocaleController.isRTL ? 64 : 75) + 4;
                                    } else {
                                        f10 = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(f10);
                                    fc0Var.n = z10;
                                    fc0Var.setWillNotDraw((z10 || fc0Var.r) ? false : true);
                                    fc0Var.b(LiteMode.isPowerSaverApplied(), false);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view2;
                                CharSequence charSequence4 = ac0Var.c;
                                if (TextUtils.isEmpty(charSequence4)) {
                                    z8Var.setFixedSize(12);
                                } else {
                                    z8Var.setFixedSize(0);
                                }
                                z8Var.setText(charSequence4);
                                z8Var.setContentDescription(charSequence4);
                                z8Var.setBackground(null);
                                break;
                            }
                        } else {
                            ((ec0) view2).a();
                            break;
                        }
                    } else {
                        ((org.telegram.ui.Cells.l4) view2).setText(ac0Var.c);
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
                vu vuVar = (vu) obj;
                zu zuVar = vuVar.l3;
                org.telegram.ui.ActionBar.f6 f6Var = vuVar.m2;
                if (i10 == 0) {
                    Context context = vuVar.getContext();
                    int[] iArr = zu.e;
                    su suVar = new su(this, context, iArr.length, iArr, zu.f);
                    vuVar.k3 = suVar;
                    suVar.setInterceptTouch(false);
                    View view3 = vuVar.k3;
                    view3.setTag(-33024);
                    view = view3;
                } else if (i10 == 1) {
                    Context context2 = vuVar.getContext();
                    yu yuVar = new yu(context2);
                    TextView textView = new TextView(context2);
                    yuVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(zuVar.getThemedColor(org.telegram.ui.ActionBar.j6.y6));
                    yuVar.addView(textView, k7.b6.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                    yuVar.setTag(-33024);
                    view = yuVar;
                } else if (i10 == 3) {
                    view = new org.telegram.ui.Cells.z8(vuVar.getContext());
                } else if (i10 == 4) {
                    View l4Var = new org.telegram.ui.Cells.l4(vuVar.getContext());
                    l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
                    view = l4Var;
                } else if (i10 == 5) {
                    org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(vuVar.getContext());
                    n8Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, f6Var));
                    n8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
                    view = n8Var;
                } else if (i10 == 6) {
                    xu xuVar = new xu(vuVar.getContext());
                    xuVar.a = new Path();
                    Paint paint = new Paint(1);
                    xuVar.b = paint;
                    xuVar.c = true;
                    paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    view = xuVar;
                } else if (i10 != 7) {
                    view = new ou(zuVar, vuVar.getContext());
                } else {
                    View gnVar = new org.telegram.ui.Components.gn(vuVar.getContext(), 11);
                    int i12 = org.telegram.ui.ActionBar.j6.d6;
                    int i13 = vu.m3;
                    gnVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, vuVar.m2));
                    view = gnVar;
                }
                return new org.telegram.ui.Components.dl0(view);
            default:
                gc0 gc0Var = (gc0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view2 = new org.telegram.ui.Cells.l4(context3);
                } else if (i10 == 1) {
                    view2 = new ec0(gc0Var, context3);
                } else if (i10 == 2) {
                    view2 = new zb0(context3);
                } else if (i10 == 3 || i10 == 4) {
                    view2 = new fc0(gc0Var, context3);
                } else if (i10 == 5) {
                    view2 = new org.telegram.ui.Cells.n8(23, context3, null, false, true);
                }
                return new org.telegram.ui.Components.dl0(view2);
        }
    }
}
