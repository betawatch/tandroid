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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class su extends og.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ su(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        switch (this.d) {
            case 0:
                pu puVar = (pu) ((uu) this.e).a3.get(d1Var.b());
                int i10 = puVar.a;
                if (i10 == 5 || (i10 == 2 && puVar.h != -1)) {
                }
                break;
            default:
                int i11 = d1Var.f;
                if (i11 == 4 || i11 == 3 || i11 == 5) {
                }
                break;
        }
        return true;
    }

    @Override // s4.i0
    public final int h() {
        switch (this.d) {
            case 0:
                return ((uu) this.e).a3.size();
            default:
                return ((mc0) this.e).s.size();
        }
    }

    @Override // s4.i0
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((pu) ((uu) this.e).a3.get(i10)).a;
            default:
                mc0 mc0Var = (mc0) this.e;
                if (i10 < 0 || i10 >= mc0Var.s.size()) {
                    return 2;
                }
                return ((gc0) mc0Var.s.get(i10)).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0217  */
    @Override // s4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.d1 d1Var, int i10) {
        Boolean bool;
        boolean z10;
        float f7;
        switch (this.d) {
            case 0:
                uu uuVar = (uu) this.e;
                ArrayList arrayList = uuVar.a3;
                int b10 = d1Var.b();
                View view = d1Var.a;
                pu puVar = (pu) arrayList.get(b10);
                int i11 = d1Var.f;
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
                                        ((org.telegram.ui.Cells.r8) view).i(puVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.m4) view).setText(puVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.e9) view).setText(puVar.f);
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
                            boolean z11 = i15 < h() && ((pu) arrayList.get(i15)).a == i11;
                            ImageView imageView = nuVar.a;
                            if (i14 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean q6 = org.telegram.ui.ActionBar.i6.I.q();
                                org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(1);
                                qc0Var.b(i12, i13);
                                qc0Var.b = q6;
                                imageView.setBackground(qc0Var);
                                imageView.setImageResource(i14);
                            }
                            nuVar.b.setText(charSequence);
                            nuVar.d.setText(charSequence2);
                            nuVar.e = z11;
                            nuVar.setWillNotDraw(!z11);
                            int i16 = puVar.h;
                            if (i16 >= 0) {
                                tu[] tuVarArr = uuVar.e3;
                                if (i16 >= tuVarArr.length || tuVarArr[i16].c > 0) {
                                    bool = Boolean.valueOf(uuVar.g3[i16]);
                                    ImageView imageView2 = nuVar.c;
                                    if (bool == null) {
                                        imageView2.setVisibility(0);
                                        imageView2.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(org.telegram.ui.Components.hs.h).start();
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
                    org.telegram.ui.Components.gd gdVar = (org.telegram.ui.Components.gd) view;
                    if (uuVar.e3 != null) {
                        gdVar.f(uuVar.h3, uuVar.V2, uuVar.f3);
                    }
                    uuVar.V2 = false;
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((mc0) this.e).s;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    gc0 gc0Var = (gc0) arrayList2.get(i10);
                    int i17 = d1Var.f;
                    View view2 = d1Var.a;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3 && i17 != 4) {
                                    if (i17 == 5) {
                                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view2;
                                        if (gc0Var.f == 1) {
                                            r8Var.j(gc0Var.c, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i18 = i10 + 1;
                                    boolean z12 = i18 < arrayList2.size() && ((gc0) arrayList2.get(i18)).a != 2;
                                    lc0 lc0Var = (lc0) view2;
                                    Switch r32 = lc0Var.f;
                                    ImageView imageView3 = lc0Var.e;
                                    org.telegram.ui.Components.r6 r6Var = lc0Var.d;
                                    ImageView imageView4 = lc0Var.a;
                                    org.telegram.ui.Components.dq dqVar = lc0Var.h;
                                    ai.q4 q4Var = lc0Var.c;
                                    int i19 = gc0Var.a;
                                    CharSequence charSequence3 = gc0Var.c;
                                    int i20 = gc0Var.e;
                                    if (i19 == 3) {
                                        dqVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(gc0Var.d);
                                        q4Var.setText(charSequence3);
                                        boolean z13 = Integer.bitCount(i20) > 1;
                                        lc0Var.v = z13;
                                        if (z13) {
                                            lc0Var.c(gc0Var, false);
                                            r6Var.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            r6Var.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        q4Var.setTranslationX(0.0f);
                                        r32.setVisibility(0);
                                        r32.c(LiteMode.isEnabled(i20), false);
                                        z10 = true;
                                        lc0Var.r = Integer.bitCount(i20) > 1;
                                    } else {
                                        z10 = true;
                                        dqVar.setVisibility(0);
                                        dqVar.a(LiteMode.isEnabled(i20), false);
                                        imageView4.setVisibility(8);
                                        r32.setVisibility(8);
                                        r6Var.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        q4Var.setText(charSequence3);
                                        q4Var.setTranslationX(AndroidUtilities.dp(41.0f) * (LocaleController.isRTL ? -2.2f : 1.0f));
                                        lc0Var.v = false;
                                        lc0Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) lc0Var.b.getLayoutParams();
                                    if (gc0Var.a == 3) {
                                        f7 = (LocaleController.isRTL ? 64 : 75) + 4;
                                    } else {
                                        f7 = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(f7);
                                    lc0Var.n = z12;
                                    lc0Var.setWillNotDraw((z12 || lc0Var.r) ? false : z10);
                                    lc0Var.b(LiteMode.isPowerSaverApplied(), false);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view2;
                                CharSequence charSequence4 = gc0Var.c;
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
                            ((kc0) view2).a();
                            break;
                        }
                    } else {
                        ((org.telegram.ui.Cells.m4) view2).setText(gc0Var.c);
                        break;
                    }
                }
                break;
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11 = this.d;
        View view2 = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                uu uuVar = (uu) obj;
                yu yuVar = uuVar.m3;
                org.telegram.ui.ActionBar.e6 e6Var = uuVar.n2;
                if (i10 == 0) {
                    Context context = uuVar.getContext();
                    int[] iArr = yu.e;
                    ru ruVar = new ru(this, context, iArr.length, iArr, yu.f);
                    uuVar.l3 = ruVar;
                    ruVar.setInterceptTouch(false);
                    View view3 = uuVar.l3;
                    view3.setTag(-33024);
                    view = view3;
                } else if (i10 == 1) {
                    Context context2 = uuVar.getContext();
                    xu xuVar = new xu(context2);
                    TextView textView = new TextView(context2);
                    xuVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(yuVar.getThemedColor(org.telegram.ui.ActionBar.i6.y6));
                    xuVar.addView(textView, w7.x5.a(-2.0f, 24.0f, 0.0f, 24.0f, 14.0f, -1, 119));
                    xuVar.setTag(-33024);
                    view = xuVar;
                } else if (i10 == 3) {
                    view = new org.telegram.ui.Cells.e9(uuVar.getContext());
                } else if (i10 == 4) {
                    View m4Var = new org.telegram.ui.Cells.m4(uuVar.getContext());
                    m4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, e6Var));
                    view = m4Var;
                } else if (i10 == 5) {
                    org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(uuVar.getContext());
                    r8Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.p7, e6Var));
                    r8Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, e6Var));
                    view = r8Var;
                } else if (i10 == 6) {
                    wu wuVar = new wu(uuVar.getContext());
                    wuVar.a = new Path();
                    Paint paint = new Paint(1);
                    wuVar.b = paint;
                    wuVar.c = true;
                    paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
                    view = wuVar;
                } else if (i10 != 7) {
                    view = new nu(yuVar, uuVar.getContext());
                } else {
                    View aoVar = new org.telegram.ui.Components.ao(uuVar.getContext(), 14);
                    int i12 = org.telegram.ui.ActionBar.i6.d6;
                    int i13 = uu.n3;
                    aoVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(i12, uuVar.n2));
                    view = aoVar;
                }
                return new org.telegram.ui.Components.am0(view);
            default:
                mc0 mc0Var = (mc0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view2 = new org.telegram.ui.Cells.m4(context3);
                } else if (i10 == 1) {
                    view2 = new kc0(mc0Var, context3);
                } else if (i10 == 2) {
                    view2 = new fc0(context3);
                } else if (i10 == 3 || i10 == 4) {
                    view2 = new lc0(mc0Var, context3);
                } else if (i10 == 5) {
                    view2 = new org.telegram.ui.Cells.r8(23, context3, null, false, true);
                }
                return new org.telegram.ui.Components.am0(view2);
        }
    }
}
