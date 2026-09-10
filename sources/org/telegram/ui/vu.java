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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vu extends ng.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        switch (this.d) {
            case 0:
                su suVar = (su) ((xu) this.e).c3.get(c1Var.b());
                int i10 = suVar.a;
                if (i10 == 5 || (i10 == 2 && suVar.h != -1)) {
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
                return ((xu) this.e).c3.size();
            default:
                return ((nc0) this.e).s.size();
        }
    }

    @Override // s4.h0
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((su) ((xu) this.e).c3.get(i10)).a;
            default:
                nc0 nc0Var = (nc0) this.e;
                if (i10 < 0 || i10 >= nc0Var.s.size()) {
                    return 2;
                }
                return ((hc0) nc0Var.s.get(i10)).a;
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
                xu xuVar = (xu) this.e;
                ArrayList arrayList = xuVar.c3;
                int b10 = c1Var.b();
                View view = c1Var.a;
                su suVar = (su) arrayList.get(b10);
                int i11 = c1Var.f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 5) {
                                        if (i11 == 6) {
                                            ((zu) view).setTop(true);
                                            break;
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.s8) view).i(suVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.m4) view).setText(suVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.f9) view).setText(suVar.f);
                                break;
                            }
                        } else {
                            qu quVar = (qu) view;
                            int i12 = suVar.d;
                            int i13 = suVar.e;
                            int i14 = suVar.c;
                            CharSequence charSequence = suVar.f;
                            CharSequence charSequence2 = suVar.g;
                            int i15 = i10 + 1;
                            boolean z10 = i15 < h() && ((su) arrayList.get(i15)).a == i11;
                            ImageView imageView = quVar.a;
                            if (i14 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean q6 = org.telegram.ui.ActionBar.j6.I.q();
                                org.telegram.ui.Components.zb0 zb0Var = new org.telegram.ui.Components.zb0(1);
                                zb0Var.b(i12, i13);
                                zb0Var.b = q6;
                                imageView.setBackground(zb0Var);
                                imageView.setImageResource(i14);
                            }
                            quVar.b.setText(charSequence);
                            quVar.d.setText(charSequence2);
                            quVar.e = z10;
                            quVar.setWillNotDraw(!z10);
                            int i16 = suVar.h;
                            if (i16 >= 0) {
                                wu[] wuVarArr = xuVar.g3;
                                if (i16 >= wuVarArr.length || wuVarArr[i16].c > 0) {
                                    bool = Boolean.valueOf(xuVar.i3[i16]);
                                    ImageView imageView2 = quVar.c;
                                    if (bool == null) {
                                        imageView2.setVisibility(0);
                                        imageView2.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(org.telegram.ui.Components.wr.h).start();
                                        break;
                                    } else {
                                        imageView2.setVisibility(8);
                                        break;
                                    }
                                }
                            }
                            bool = null;
                            ImageView imageView22 = quVar.c;
                            if (bool == null) {
                            }
                        }
                    } else {
                        ((av) view).a.setText(suVar.f);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.cd cdVar = (org.telegram.ui.Components.cd) view;
                    if (xuVar.g3 != null) {
                        cdVar.f(xuVar.j3, xuVar.X2, xuVar.h3);
                    }
                    xuVar.X2 = false;
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((nc0) this.e).s;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    hc0 hc0Var = (hc0) arrayList2.get(i10);
                    int i17 = c1Var.f;
                    View view2 = c1Var.a;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3 && i17 != 4) {
                                    if (i17 == 5) {
                                        org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view2;
                                        if (hc0Var.f == 1) {
                                            s8Var.j(hc0Var.c, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i18 = i10 + 1;
                                    boolean z11 = i18 < arrayList2.size() && ((hc0) arrayList2.get(i18)).a != 2;
                                    mc0 mc0Var = (mc0) view2;
                                    Switch r32 = mc0Var.f;
                                    ImageView imageView3 = mc0Var.e;
                                    org.telegram.ui.Components.o6 o6Var = mc0Var.d;
                                    ImageView imageView4 = mc0Var.a;
                                    org.telegram.ui.Components.tp tpVar = mc0Var.h;
                                    di.h hVar = mc0Var.c;
                                    int i19 = hc0Var.a;
                                    CharSequence charSequence3 = hc0Var.c;
                                    int i20 = hc0Var.e;
                                    if (i19 == 3) {
                                        tpVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(hc0Var.d);
                                        hVar.setText(charSequence3);
                                        boolean z12 = Integer.bitCount(i20) > 1;
                                        mc0Var.v = z12;
                                        if (z12) {
                                            mc0Var.c(hc0Var, false);
                                            o6Var.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            o6Var.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        hVar.setTranslationX(0.0f);
                                        r32.setVisibility(0);
                                        r32.c(LiteMode.isEnabled(i20), false);
                                        mc0Var.r = Integer.bitCount(i20) > 1;
                                    } else {
                                        tpVar.setVisibility(0);
                                        tpVar.a(LiteMode.isEnabled(i20), false);
                                        imageView4.setVisibility(8);
                                        r32.setVisibility(8);
                                        o6Var.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        hVar.setText(charSequence3);
                                        hVar.setTranslationX(AndroidUtilities.dp(41.0f) * (LocaleController.isRTL ? -2.2f : 1.0f));
                                        mc0Var.v = false;
                                        mc0Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mc0Var.b.getLayoutParams();
                                    if (hc0Var.a == 3) {
                                        f7 = (LocaleController.isRTL ? 64 : 75) + 4;
                                    } else {
                                        f7 = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(f7);
                                    mc0Var.n = z11;
                                    mc0Var.setWillNotDraw((z11 || mc0Var.r) ? false : true);
                                    mc0Var.b(LiteMode.isPowerSaverApplied(), false);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view2;
                                CharSequence charSequence4 = hc0Var.c;
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
                            ((lc0) view2).a();
                            break;
                        }
                    } else {
                        ((org.telegram.ui.Cells.m4) view2).setText(hc0Var.c);
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
                xu xuVar = (xu) obj;
                bv bvVar = xuVar.o3;
                org.telegram.ui.ActionBar.f6 f6Var = xuVar.p2;
                if (i10 == 0) {
                    Context context = xuVar.getContext();
                    int[] iArr = bv.e;
                    uu uuVar = new uu(this, context, iArr.length, iArr, bv.f);
                    xuVar.n3 = uuVar;
                    uuVar.setInterceptTouch(false);
                    View view3 = xuVar.n3;
                    view3.setTag(-33024);
                    view = view3;
                } else if (i10 == 1) {
                    Context context2 = xuVar.getContext();
                    av avVar = new av(context2);
                    TextView textView = new TextView(context2);
                    avVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(bvVar.getThemedColor(org.telegram.ui.ActionBar.j6.y6));
                    avVar.addView(textView, w7.a6.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                    avVar.setTag(-33024);
                    view = avVar;
                } else if (i10 == 3) {
                    view = new org.telegram.ui.Cells.f9(xuVar.getContext());
                } else if (i10 == 4) {
                    View m4Var = new org.telegram.ui.Cells.m4(xuVar.getContext());
                    m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
                    view = m4Var;
                } else if (i10 == 5) {
                    org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(xuVar.getContext());
                    s8Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, f6Var));
                    s8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
                    view = s8Var;
                } else if (i10 == 6) {
                    zu zuVar = new zu(xuVar.getContext());
                    zuVar.a = new Path();
                    Paint paint = new Paint(1);
                    zuVar.b = paint;
                    zuVar.c = true;
                    paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    view = zuVar;
                } else if (i10 != 7) {
                    view = new qu(bvVar, xuVar.getContext());
                } else {
                    View qnVar = new org.telegram.ui.Components.qn(xuVar.getContext(), 13);
                    int i12 = org.telegram.ui.ActionBar.j6.d6;
                    int i13 = xu.p3;
                    qnVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, xuVar.p2));
                    view = qnVar;
                }
                return new org.telegram.ui.Components.fl0(view);
            default:
                nc0 nc0Var = (nc0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view2 = new org.telegram.ui.Cells.m4(context3);
                } else if (i10 == 1) {
                    view2 = new lc0(nc0Var, context3);
                } else if (i10 == 2) {
                    view2 = new gc0(context3);
                } else if (i10 == 3 || i10 == 4) {
                    view2 = new mc0(nc0Var, context3);
                } else if (i10 == 5) {
                    view2 = new org.telegram.ui.Cells.s8(23, context3, null, false, true);
                }
                return new org.telegram.ui.Components.fl0(view2);
        }
    }
}
