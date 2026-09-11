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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class uu extends pg.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ uu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        switch (this.d) {
            case 0:
                ru ruVar = (ru) ((wu) this.e).c3.get(c1Var.b());
                int i10 = ruVar.a;
                if (i10 == 5 || (i10 == 2 && ruVar.h != -1)) {
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
                return ((wu) this.e).c3.size();
            default:
                return ((nc0) this.e).s.size();
        }
    }

    @Override // s4.h0
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((ru) ((wu) this.e).c3.get(i10)).a;
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
                wu wuVar = (wu) this.e;
                ArrayList arrayList = wuVar.c3;
                int b10 = c1Var.b();
                View view = c1Var.a;
                ru ruVar = (ru) arrayList.get(b10);
                int i11 = c1Var.f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 5) {
                                        if (i11 == 6) {
                                            ((yu) view).setTop(true);
                                            break;
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.r8) view).i(ruVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.l4) view).setText(ruVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.e9) view).setText(ruVar.f);
                                break;
                            }
                        } else {
                            pu puVar = (pu) view;
                            int i12 = ruVar.d;
                            int i13 = ruVar.e;
                            int i14 = ruVar.c;
                            CharSequence charSequence = ruVar.f;
                            CharSequence charSequence2 = ruVar.g;
                            int i15 = i10 + 1;
                            boolean z10 = i15 < h() && ((ru) arrayList.get(i15)).a == i11;
                            ImageView imageView = puVar.a;
                            if (i14 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean q6 = org.telegram.ui.ActionBar.j6.I.q();
                                org.telegram.ui.Components.rb0 rb0Var = new org.telegram.ui.Components.rb0(1);
                                rb0Var.b(i12, i13);
                                rb0Var.b = q6;
                                imageView.setBackground(rb0Var);
                                imageView.setImageResource(i14);
                            }
                            puVar.b.setText(charSequence);
                            puVar.d.setText(charSequence2);
                            puVar.e = z10;
                            puVar.setWillNotDraw(!z10);
                            int i16 = ruVar.h;
                            if (i16 >= 0) {
                                vu[] vuVarArr = wuVar.g3;
                                if (i16 >= vuVarArr.length || vuVarArr[i16].c > 0) {
                                    bool = Boolean.valueOf(wuVar.i3[i16]);
                                    ImageView imageView2 = puVar.c;
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
                            ImageView imageView22 = puVar.c;
                            if (bool == null) {
                            }
                        }
                    } else {
                        ((zu) view).a.setText(ruVar.f);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.ed edVar = (org.telegram.ui.Components.ed) view;
                    if (wuVar.g3 != null) {
                        edVar.f(wuVar.j3, wuVar.X2, wuVar.h3);
                    }
                    wuVar.X2 = false;
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
                                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view2;
                                        if (hc0Var.f == 1) {
                                            r8Var.j(hc0Var.c, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i18 = i10 + 1;
                                    boolean z11 = i18 < arrayList2.size() && ((hc0) arrayList2.get(i18)).a != 2;
                                    mc0 mc0Var = (mc0) view2;
                                    Switch r32 = mc0Var.f;
                                    ImageView imageView3 = mc0Var.e;
                                    org.telegram.ui.Components.q6 q6Var = mc0Var.d;
                                    ImageView imageView4 = mc0Var.a;
                                    org.telegram.ui.Components.mp mpVar = mc0Var.h;
                                    bi.c4 c4Var = mc0Var.c;
                                    int i19 = hc0Var.a;
                                    CharSequence charSequence3 = hc0Var.c;
                                    int i20 = hc0Var.e;
                                    if (i19 == 3) {
                                        mpVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(hc0Var.d);
                                        c4Var.setText(charSequence3);
                                        boolean z12 = Integer.bitCount(i20) > 1;
                                        mc0Var.v = z12;
                                        if (z12) {
                                            mc0Var.c(hc0Var, false);
                                            q6Var.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            q6Var.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        c4Var.setTranslationX(0.0f);
                                        r32.setVisibility(0);
                                        r32.c(LiteMode.isEnabled(i20), false);
                                        mc0Var.r = Integer.bitCount(i20) > 1;
                                    } else {
                                        mpVar.setVisibility(0);
                                        mpVar.a(LiteMode.isEnabled(i20), false);
                                        imageView4.setVisibility(8);
                                        r32.setVisibility(8);
                                        q6Var.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        c4Var.setText(charSequence3);
                                        c4Var.setTranslationX(AndroidUtilities.dp(41.0f) * (LocaleController.isRTL ? -2.2f : 1.0f));
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
                                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view2;
                                CharSequence charSequence4 = hc0Var.c;
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
                            ((lc0) view2).a();
                            break;
                        }
                    } else {
                        ((org.telegram.ui.Cells.l4) view2).setText(hc0Var.c);
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
                wu wuVar = (wu) obj;
                av avVar = wuVar.o3;
                org.telegram.ui.ActionBar.f6 f6Var = wuVar.p2;
                if (i10 == 0) {
                    Context context = wuVar.getContext();
                    int[] iArr = av.e;
                    tu tuVar = new tu(this, context, iArr.length, iArr, av.f);
                    wuVar.n3 = tuVar;
                    tuVar.setInterceptTouch(false);
                    View view3 = wuVar.n3;
                    view3.setTag(-33024);
                    view = view3;
                } else if (i10 == 1) {
                    Context context2 = wuVar.getContext();
                    zu zuVar = new zu(context2);
                    TextView textView = new TextView(context2);
                    zuVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(avVar.getThemedColor(org.telegram.ui.ActionBar.j6.y6));
                    zuVar.addView(textView, w7.x5.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                    zuVar.setTag(-33024);
                    view = zuVar;
                } else if (i10 == 3) {
                    view = new org.telegram.ui.Cells.e9(wuVar.getContext());
                } else if (i10 == 4) {
                    View l4Var = new org.telegram.ui.Cells.l4(wuVar.getContext());
                    l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
                    view = l4Var;
                } else if (i10 == 5) {
                    org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(wuVar.getContext());
                    r8Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, f6Var));
                    r8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
                    view = r8Var;
                } else if (i10 == 6) {
                    yu yuVar = new yu(wuVar.getContext());
                    yuVar.a = new Path();
                    Paint paint = new Paint(1);
                    yuVar.b = paint;
                    yuVar.c = true;
                    paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    view = yuVar;
                } else if (i10 != 7) {
                    view = new pu(avVar, wuVar.getContext());
                } else {
                    View jnVar = new org.telegram.ui.Components.jn(wuVar.getContext(), 14);
                    int i12 = org.telegram.ui.ActionBar.j6.d6;
                    int i13 = wu.p3;
                    jnVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, wuVar.p2));
                    view = jnVar;
                }
                return new org.telegram.ui.Components.vk0(view);
            default:
                nc0 nc0Var = (nc0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view2 = new org.telegram.ui.Cells.l4(context3);
                } else if (i10 == 1) {
                    view2 = new lc0(nc0Var, context3);
                } else if (i10 == 2) {
                    view2 = new gc0(context3);
                } else if (i10 == 3 || i10 == 4) {
                    view2 = new mc0(nc0Var, context3);
                } else if (i10 == 5) {
                    view2 = new org.telegram.ui.Cells.r8(23, context3, null, false, true);
                }
                return new org.telegram.ui.Components.vk0(view2);
        }
    }
}
