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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class qu extends og.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        switch (this.d) {
            case 0:
                nu nuVar = (nu) ((su) this.e).c3.get(c1Var.b());
                int i10 = nuVar.a;
                if (i10 == 5 || (i10 == 2 && nuVar.h != -1)) {
                }
                break;
            default:
                int i11 = c1Var.f;
                if (i11 == 4 || i11 == 3 || i11 == 5) {
                }
                break;
        }
        return true;
    }

    @Override // s4.h0
    public final int h() {
        switch (this.d) {
            case 0:
                return ((su) this.e).c3.size();
            default:
                return ((ic0) this.e).s.size();
        }
    }

    @Override // s4.h0
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((nu) ((su) this.e).c3.get(i10)).a;
            default:
                ic0 ic0Var = (ic0) this.e;
                if (i10 < 0 || i10 >= ic0Var.s.size()) {
                    return 2;
                }
                return ((cc0) ic0Var.s.get(i10)).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0218  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        Boolean bool;
        float f7;
        switch (this.d) {
            case 0:
                su suVar = (su) this.e;
                ArrayList arrayList = suVar.c3;
                int b10 = c1Var.b();
                View view = c1Var.a;
                nu nuVar = (nu) arrayList.get(b10);
                int i11 = c1Var.f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 5) {
                                        if (i11 == 6) {
                                            ((uu) view).setTop(true);
                                            break;
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.s8) view).i(nuVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.m4) view).setText(nuVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.f9) view).setText(nuVar.f);
                                break;
                            }
                        } else {
                            lu luVar = (lu) view;
                            int i12 = nuVar.d;
                            int i13 = nuVar.e;
                            int i14 = nuVar.c;
                            CharSequence charSequence = nuVar.f;
                            CharSequence charSequence2 = nuVar.g;
                            int i15 = i10 + 1;
                            boolean z10 = i15 < h() && ((nu) arrayList.get(i15)).a == i11;
                            ImageView imageView = luVar.a;
                            if (i14 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
                                org.telegram.ui.Components.pb0 pb0Var = new org.telegram.ui.Components.pb0(1);
                                pb0Var.b(i12, i13);
                                pb0Var.b = q6;
                                imageView.setBackground(pb0Var);
                                imageView.setImageResource(i14);
                            }
                            luVar.b.setText(charSequence);
                            luVar.d.setText(charSequence2);
                            luVar.e = z10;
                            luVar.setWillNotDraw(!z10);
                            int i16 = nuVar.h;
                            if (i16 >= 0) {
                                ru[] ruVarArr = suVar.g3;
                                if (i16 >= ruVarArr.length || ruVarArr[i16].c > 0) {
                                    bool = Boolean.valueOf(suVar.i3[i16]);
                                    ImageView imageView2 = luVar.c;
                                    if (bool == null) {
                                        imageView2.setVisibility(0);
                                        imageView2.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(org.telegram.ui.Components.rr.h).start();
                                        break;
                                    } else {
                                        imageView2.setVisibility(8);
                                        break;
                                    }
                                }
                            }
                            bool = null;
                            ImageView imageView22 = luVar.c;
                            if (bool == null) {
                            }
                        }
                    } else {
                        ((vu) view).a.setText(nuVar.f);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.dd ddVar = (org.telegram.ui.Components.dd) view;
                    if (suVar.g3 != null) {
                        ddVar.f(suVar.j3, suVar.X2, suVar.h3);
                    }
                    suVar.X2 = false;
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((ic0) this.e).s;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    cc0 cc0Var = (cc0) arrayList2.get(i10);
                    int i17 = c1Var.f;
                    View view2 = c1Var.a;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3 && i17 != 4) {
                                    if (i17 == 5) {
                                        org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view2;
                                        if (cc0Var.f == 1) {
                                            s8Var.j(cc0Var.c, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i18 = i10 + 1;
                                    boolean z11 = i18 < arrayList2.size() && ((cc0) arrayList2.get(i18)).a != 2;
                                    hc0 hc0Var = (hc0) view2;
                                    Switch r32 = hc0Var.f;
                                    ImageView imageView3 = hc0Var.e;
                                    org.telegram.ui.Components.p6 p6Var = hc0Var.d;
                                    ImageView imageView4 = hc0Var.a;
                                    org.telegram.ui.Components.op opVar = hc0Var.h;
                                    ai.p4 p4Var = hc0Var.c;
                                    int i19 = cc0Var.a;
                                    CharSequence charSequence3 = cc0Var.c;
                                    int i20 = cc0Var.e;
                                    if (i19 == 3) {
                                        opVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(cc0Var.d);
                                        p4Var.setText(charSequence3);
                                        boolean z12 = Integer.bitCount(i20) > 1;
                                        hc0Var.v = z12;
                                        if (z12) {
                                            hc0Var.c(cc0Var, false);
                                            p6Var.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            p6Var.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        p4Var.setTranslationX(0.0f);
                                        r32.setVisibility(0);
                                        r32.c(LiteMode.isEnabled(i20), false);
                                        hc0Var.r = Integer.bitCount(i20) > 1;
                                    } else {
                                        opVar.setVisibility(0);
                                        opVar.a(LiteMode.isEnabled(i20), false);
                                        imageView4.setVisibility(8);
                                        r32.setVisibility(8);
                                        p6Var.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        p4Var.setText(charSequence3);
                                        p4Var.setTranslationX(AndroidUtilities.dp(41.0f) * (LocaleController.isRTL ? -2.2f : 1.0f));
                                        hc0Var.v = false;
                                        hc0Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) hc0Var.b.getLayoutParams();
                                    if (cc0Var.a == 3) {
                                        f7 = (LocaleController.isRTL ? 64 : 75) + 4;
                                    } else {
                                        f7 = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(f7);
                                    hc0Var.n = z11;
                                    hc0Var.setWillNotDraw((z11 || hc0Var.r) ? false : true);
                                    hc0Var.b(LiteMode.isPowerSaverApplied(), false);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view2;
                                CharSequence charSequence4 = cc0Var.c;
                                if (TextUtils.isEmpty(charSequence4)) {
                                    f9Var.setFixedSize(12);
                                } else {
                                    f9Var.setFixedSize(0);
                                }
                                f9Var.setText(charSequence4);
                                f9Var.setContentDescription(charSequence4);
                                f9Var.setBackground(null);
                                break;
                            }
                        } else {
                            ((gc0) view2).a();
                            break;
                        }
                    } else {
                        ((org.telegram.ui.Cells.m4) view2).setText(cc0Var.c);
                        break;
                    }
                }
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11 = this.d;
        View view2 = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                su suVar = (su) obj;
                wu wuVar = suVar.o3;
                org.telegram.ui.ActionBar.d6 d6Var = suVar.p2;
                if (i10 == 0) {
                    Context context = suVar.getContext();
                    int[] iArr = wu.e;
                    pu puVar = new pu(this, context, iArr.length, iArr, wu.f);
                    suVar.n3 = puVar;
                    puVar.setInterceptTouch(false);
                    View view3 = suVar.n3;
                    view3.setTag(-33024);
                    view = view3;
                } else if (i10 == 1) {
                    Context context2 = suVar.getContext();
                    vu vuVar = new vu(context2);
                    TextView textView = new TextView(context2);
                    vuVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(wuVar.getThemedColor(org.telegram.ui.ActionBar.h6.y6));
                    vuVar.addView(textView, w7.x5.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                    vuVar.setTag(-33024);
                    view = vuVar;
                } else if (i10 == 3) {
                    view = new org.telegram.ui.Cells.f9(suVar.getContext());
                } else if (i10 == 4) {
                    View m4Var = new org.telegram.ui.Cells.m4(suVar.getContext());
                    m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d6, d6Var));
                    view = m4Var;
                } else if (i10 == 5) {
                    org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(suVar.getContext());
                    s8Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.p7, d6Var));
                    s8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d6, d6Var));
                    view = s8Var;
                } else if (i10 == 6) {
                    uu uuVar = new uu(suVar.getContext());
                    uuVar.a = new Path();
                    Paint paint = new Paint(1);
                    uuVar.b = paint;
                    uuVar.c = true;
                    paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                    view = uuVar;
                } else if (i10 != 7) {
                    view = new lu(wuVar, suVar.getContext());
                } else {
                    View lnVar = new org.telegram.ui.Components.ln(suVar.getContext(), 14);
                    int i12 = org.telegram.ui.ActionBar.h6.d6;
                    int i13 = su.p3;
                    lnVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(i12, suVar.p2));
                    view = lnVar;
                }
                return new org.telegram.ui.Components.wk0(view);
            default:
                ic0 ic0Var = (ic0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view2 = new org.telegram.ui.Cells.m4(context3);
                } else if (i10 == 1) {
                    view2 = new gc0(ic0Var, context3);
                } else if (i10 == 2) {
                    view2 = new bc0(context3);
                } else if (i10 == 3 || i10 == 4) {
                    view2 = new hc0(ic0Var, context3);
                } else if (i10 == 5) {
                    view2 = new org.telegram.ui.Cells.s8(23, context3, null, false, true);
                }
                return new org.telegram.ui.Components.wk0(view2);
        }
    }
}
