// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w71 extends ka {
    public final /* synthetic */ byte d;
    public final Context e;
    public final /* synthetic */ d f;

    public /* synthetic */ w71(d dVar, Context context, byte b) {
        this.d = b;
        this.f = dVar;
        this.e = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i;
        switch (this.d) {
            case 0:
                long b = u69Var.b();
                y71 y71Var = (y71) this.f;
                if (b == y71Var.K || (((i = u69Var.f) == 2 && y71Var.H > 0 && !y71Var.L) || i == 5 || i == 7 || i == 11)) {
                    break;
                }
                break;
            default:
                int i2 = u69Var.f;
                if (i2 != 0 && i2 != 4) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // y59
    public final int b() {
        byte b = this.d;
        d dVar = this.f;
        switch (b) {
            case 0:
                return ((y71) dVar).g0.size();
            default:
                return ((NotificationsCustomSettingsActivity) dVar).J.size();
        }
    }

    @Override // y59
    public final int d(int i) {
        byte b = this.d;
        d dVar = this.f;
        switch (b) {
            case 0:
                return ((u71) ((y71) dVar).g0.get(i)).a;
            default:
                ArrayList arrayList = ((NotificationsCustomSettingsActivity) dVar).J;
                if (i < 0 || i >= arrayList.size()) {
                    return 5;
                }
                return ((uo7) arrayList.get(i)).a;
        }
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        int i2;
        xib xibVar;
        byte b = this.d;
        d dVar = this.f;
        switch (b) {
            case 0:
                y71 y71Var = (y71) dVar;
                ArrayList arrayList = y71Var.g0;
                u71 u71Var = (u71) arrayList.get(i);
                int i3 = u69Var.f;
                View view = u69Var.a;
                if (i3 == 0) {
                    vkb vkbVar = (vkb) view;
                    if (i == y71Var.K) {
                        vkbVar.c(jb6.M0(2131748191, null), null, false, false);
                        break;
                    }
                } else if (i3 == 1) {
                    ((njb) view).setText(gm.S2(u71Var.e));
                    break;
                } else if (i3 == 2) {
                    final j3b j3bVar = (j3b) view;
                    boolean z = y71Var.L;
                    long j = y71Var.e;
                    long j2 = y71Var.H;
                    long j3 = y71Var.J;
                    long j4 = y71Var.I;
                    yh4 yh4Var = j3bVar.J;
                    View view2 = j3bVar.x;
                    TextView textView = j3bVar.n;
                    TextView textView2 = j3bVar.h;
                    TextView textView3 = j3bVar.w;
                    vkb vkbVar2 = j3bVar.E;
                    j3bVar.e = z;
                    TextView textView4 = j3bVar.r;
                    textView4.setText(jb6.a0("TotalDeviceFreeSize", null, 2131743660, gm.i0(j3, false, false)));
                    TextView textView5 = j3bVar.s;
                    long j5 = j4 - j3;
                    textView5.setText(jb6.a0("TotalDeviceSize", null, 2131743659, gm.i0(j5, false, false)));
                    if (z) {
                        textView3.setVisibility(0);
                        textView2.setVisibility(8);
                        textView4.setVisibility(8);
                        textView5.setVisibility(8);
                        textView.setVisibility(8);
                        view2.setVisibility(8);
                        vkbVar2.setVisibility(8);
                        j3bVar.F = 0.0f;
                        j3bVar.G = 0.0f;
                        if (yh4Var != null) {
                            yh4Var.d(textView3);
                        }
                    } else {
                        if (yh4Var != null) {
                            yh4Var.F(textView3);
                        }
                        textView3.setVisibility(8);
                        if (j2 > 0) {
                            i2 = 0;
                            view2.setVisibility(0);
                            vkbVar2.setVisibility(0);
                            textView2.setVisibility(0);
                            textView.setVisibility(8);
                            vkbVar2.c(jb6.M0(2131751984, null), gm.i0(j2, false, false), false, true);
                            textView2.setText(jb6.a0("TelegramCacheSize", null, 2131743931, gm.i0(j2 + j, false, false)));
                        } else {
                            i2 = 0;
                            textView2.setVisibility(8);
                            textView.setVisibility(0);
                            textView.setText(jb6.a0("LocalDatabaseSize", null, 2131748526, gm.i0(j, false, false)));
                            view2.setVisibility(8);
                            vkbVar2.setVisibility(8);
                        }
                        textView4.setVisibility(i2);
                        textView5.setVisibility(i2);
                        float f = j2 + j;
                        float f2 = j4;
                        float f3 = f / f2;
                        float f4 = j5 / f2;
                        if (j3bVar.F != f3) {
                            ValueAnimator valueAnimator = j3bVar.H;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            final byte b2 = 0;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(j3bVar.F, f3);
                            j3bVar.H = ofFloat;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: i3b
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    byte b3 = b2;
                                    j3b j3bVar2 = j3bVar;
                                    j3bVar2.getClass();
                                    switch (b3) {
                                        case 0:
                                            j3bVar2.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            j3bVar2.invalidate();
                                            break;
                                        default:
                                            j3bVar2.G = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            j3bVar2.invalidate();
                                            break;
                                    }
                                }
                            });
                            j3bVar.H.start();
                        }
                        if (j3bVar.G != f4) {
                            ValueAnimator valueAnimator2 = j3bVar.I;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            final byte b3 = 1;
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(j3bVar.G, f4);
                            j3bVar.I = ofFloat2;
                            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: i3b
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                    byte b32 = b3;
                                    j3b j3bVar2 = j3bVar;
                                    j3bVar2.getClass();
                                    switch (b32) {
                                        case 0:
                                            j3bVar2.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                            j3bVar2.invalidate();
                                            break;
                                        default:
                                            j3bVar2.G = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                            j3bVar2.invalidate();
                                            break;
                                    }
                                }
                            });
                            j3bVar.I.start();
                        }
                    }
                    anb.X(vkbVar2.getTextView(), cmb.F6, null);
                    j3bVar.requestLayout();
                    break;
                } else if (i3 == 3) {
                    jf5 jf5Var = (jf5) view;
                    jf5Var.setText(((u71) arrayList.get(i)).d);
                    ((u71) arrayList.get(i)).getClass();
                    jf5Var.setTopMargin(15);
                    ((u71) arrayList.get(i)).getClass();
                    jf5Var.setBottomMargin(0);
                    break;
                } else if (i3 == 7) {
                    xib xibVar2 = (xib) view;
                    v61 v61Var = y71Var.getMessagesController().h4;
                    int i4 = u71Var.c;
                    int size = v61Var.d(((u71) arrayList.get(i)).c).size();
                    String G = size > 0 ? jb6.G(size, "ExceptionShort", Integer.valueOf(size)) : null;
                    String f5 = v61.f(v61Var.c(i4));
                    if (((u71) arrayList.get(i)).c == 0) {
                        xibVar = xibVar2;
                        xibVar.r(jb6.M0(2131746488, null), f5, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                    } else {
                        xibVar = xibVar2;
                        if (((u71) arrayList.get(i)).c == 1) {
                            xibVar.r(jb6.M0(2131749214, null), f5, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                        } else if (((u71) arrayList.get(i)).c == 2) {
                            xibVar.r(jb6.M0(2131752603, null), f5, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                        } else if (((u71) arrayList.get(i)).c == 3) {
                            xibVar.r(jb6.M0(2131752599, null), f5, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                        }
                    }
                    xibVar.setSubtitle(G);
                    break;
                } else {
                    switch (i3) {
                        case 9:
                            y71Var.y0();
                            break;
                        case 10:
                            m71 m71Var = y71Var.Y;
                            if (m71Var != null && !y71Var.L) {
                                long j6 = y71Var.H;
                                boolean z2 = j6 > 0;
                                long j7 = y71Var.I;
                                m71Var.b(j7 <= 0 ? 0.0f : j6 / j7, (y71Var.J <= 0 || j7 <= 0) ? 0.0f : (j7 - r9) / j7, z2);
                                break;
                            }
                            break;
                        case 11:
                            oh2 oh2Var = (oh2) view;
                            int i5 = u71Var.f;
                            boolean o0 = i5 < 0 ? y71Var.o0() : y71Var.d[i5];
                            String str = u71Var.d;
                            int[] iArr = y71Var.V;
                            int i6 = u71Var.f;
                            if (i6 < 0) {
                                i6 = 9;
                            }
                            int i7 = iArr[i6];
                            SpannableString spannableString = new SpannableString(i7 <= 0 ? String.format("<%.1f%%", Float.valueOf(1.0f)) : String.format("%d%%", Integer.valueOf(i7)));
                            spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                            spannableString.setSpan(new z5c(gm.o()), 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                            spannableStringBuilder.append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) spannableString);
                            oh2Var.e(spannableStringBuilder, gm.i0(u71Var.g, false, false), o0, u71Var.f >= 0 ? !u71Var.j : !y71Var.M, false);
                            int i8 = u71Var.h;
                            int i9 = cmb.j7;
                            jh2 jh2Var = oh2Var.r;
                            if (jh2Var != null) {
                                jh2Var.b(i8, i8, i9);
                            }
                            oh2Var.setCollapsed(u71Var.f < 0 ? Boolean.valueOf(y71Var.M) : null);
                            if (u71Var.f == -1) {
                                oh2Var.d(new j1(this, (byte) 29), new t(this, oh2Var, (byte) 27));
                            } else {
                                oh2Var.d(null, null);
                            }
                            oh2Var.setPad(u71Var.i ? 1 : 0);
                            break;
                    }
                }
                break;
            default:
                ArrayList arrayList2 = ((NotificationsCustomSettingsActivity) dVar).J;
                if (i >= 0 && i < arrayList2.size()) {
                    uo7 uo7Var = (uo7) arrayList2.get(i);
                    int i10 = i + 1;
                    boolean z3 = i10 < arrayList2.size() && ((uo7) arrayList2.get(i10)).a != 4;
                    int i11 = u69Var.f;
                    View view3 = u69Var.a;
                    switch (i11) {
                        case 0:
                            ((jf5) view3).setText(uo7Var.e);
                            break;
                        case 1:
                            ((bjb) view3).f(String.valueOf(uo7Var.e), uo7Var.i, z3);
                            break;
                        case 2:
                            ((w8c) view3).f(uo7Var.g, null, z3);
                            break;
                        case 3:
                            ((djb) view3).b(uo7Var.h, String.valueOf(uo7Var.e), z3);
                            break;
                        case 4:
                            njb njbVar = (njb) view3;
                            if (uo7Var.e != null) {
                                njbVar.setFixedSize(0);
                                njbVar.setText(uo7Var.e);
                                break;
                            } else {
                                njbVar.setFixedSize(12);
                                njbVar.setText(null);
                                break;
                            }
                        case 5:
                            ((vkb) view3).c(uo7Var.e, uo7Var.f, false, z3);
                            break;
                        case 6:
                            yn7 yn7Var = (yn7) view3;
                            yn7Var.setDrawLine(true);
                            yn7Var.setChecked(uo7Var.i);
                            yn7Var.b(uo7Var.e, uo7Var.f, uo7Var.d, uo7Var.i, 0, false, z3, true);
                            break;
                        case 7:
                            xib xibVar3 = (xib) view3;
                            if (uo7Var.d != 0) {
                                xibVar3.g(cmb.u6, cmb.t6);
                                xibVar3.o(uo7Var.d, String.valueOf(uo7Var.e), z3);
                                break;
                            } else {
                                xibVar3.g(-1, cmb.o7);
                                xibVar3.k(String.valueOf(uo7Var.e), z3);
                                break;
                            }
                        case 8:
                            to7 to7Var = (to7) view3;
                            to7Var.g(cmb.u6, cmb.t6);
                            String str2 = uo7Var.e;
                            wi8.t(to7Var.a0.animate().rotation(uo7Var.d == 1 ? 0.0f : 180.0f), d53.h, 340L);
                            to7Var.k(str2, z3);
                            break;
                    }
                }
                break;
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        ylb ylbVar;
        FrameLayout yn7Var;
        byte b = this.d;
        Context context = this.e;
        d dVar = this.f;
        switch (b) {
            case 0:
                y71 y71Var = (y71) dVar;
                if (i != 0) {
                    byte b2 = 25;
                    switch (i) {
                        case 2:
                            j3b j3bVar = new j3b(context);
                            Paint paint = new Paint(1);
                            j3bVar.a = paint;
                            Paint paint2 = new Paint(1);
                            Paint paint3 = new Paint(1);
                            j3bVar.b = paint3;
                            Paint paint4 = new Paint(1);
                            j3bVar.c = paint4;
                            j3bVar.d = new Paint();
                            ef1 ef1Var = new ef1(nm7.w3, nm7.d4);
                            j3bVar.M = ef1Var;
                            j3bVar.setWillNotDraw(false);
                            ef1Var.k = false;
                            paint.setStrokeWidth(gm.L(6.0f));
                            paint2.setStrokeWidth(gm.L(6.0f));
                            paint3.setStrokeWidth(gm.L(6.0f));
                            paint4.setStrokeWidth(gm.L(6.0f));
                            Paint.Cap cap = Paint.Cap.ROUND;
                            paint.setStrokeCap(cap);
                            paint2.setStrokeCap(cap);
                            paint3.setStrokeCap(cap);
                            paint4.setStrokeCap(cap);
                            xd9 xd9Var = new xd9((byte) 11, context, j3bVar);
                            j3bVar.f = xd9Var;
                            j3bVar.addView(xd9Var, qoe.c(-2.0f, -1));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            j3bVar.addView(linearLayout, qoe.c(-2.0f, -1));
                            ct8 ct8Var = new ct8(context, (byte) 13);
                            linearLayout.addView(ct8Var, qoe.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                            TextView textView = new TextView(context);
                            j3bVar.w = textView;
                            int i2 = cmb.x6;
                            anb.X(textView, i2, null);
                            String M0 = jb6.M0(2131752596, "CalculatingSize");
                            int indexOf = M0.indexOf("...");
                            if (indexOf >= 0) {
                                SpannableString spannableString = new SpannableString(M0);
                                yh4 yh4Var = new yh4(textView);
                                j3bVar.J = yh4Var;
                                yh4Var.M(spannableString, indexOf);
                                textView.setText(spannableString);
                            } else {
                                textView.setText(M0);
                            }
                            TextView textView2 = new TextView(context);
                            j3bVar.h = textView2;
                            textView2.setCompoundDrawablePadding(gm.L(6.0f));
                            anb.X(textView2, i2, null);
                            TextView textView3 = new TextView(context);
                            j3bVar.n = textView3;
                            textView3.setCompoundDrawablePadding(gm.L(6.0f));
                            anb.X(textView3, i2, null);
                            TextView textView4 = new TextView(context);
                            j3bVar.r = textView4;
                            textView4.setCompoundDrawablePadding(gm.L(6.0f));
                            anb.X(textView4, i2, null);
                            TextView textView5 = new TextView(context);
                            j3bVar.s = textView5;
                            textView5.setCompoundDrawablePadding(gm.L(6.0f));
                            anb.X(textView5, i2, null);
                            j3bVar.y = cmb.w0(null, cmb.Lj, false);
                            textView2.setCompoundDrawablesWithIntrinsicBounds(cmb.K(gm.L(10.0f), j3bVar.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView2.setCompoundDrawablePadding(gm.L(6.0f));
                            textView4.setCompoundDrawablesWithIntrinsicBounds(cmb.K(gm.L(10.0f), on2.p(j3bVar.y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView4.setCompoundDrawablePadding(gm.L(6.0f));
                            textView5.setCompoundDrawablesWithIntrinsicBounds(cmb.K(gm.L(10.0f), on2.p(j3bVar.y, nm7.K1)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView5.setCompoundDrawablePadding(gm.L(6.0f));
                            textView3.setCompoundDrawablesWithIntrinsicBounds(cmb.K(gm.L(10.0f), j3bVar.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView3.setCompoundDrawablePadding(gm.L(6.0f));
                            ct8Var.addView(textView, qoe.c(-2.0f, -2));
                            ct8Var.addView(textView3, qoe.c(-2.0f, -2));
                            ct8Var.addView(textView2, qoe.c(-2.0f, -2));
                            ct8Var.addView(textView5, qoe.c(-2.0f, -2));
                            ct8Var.addView(textView4, qoe.c(-2.0f, -2));
                            View view3 = new View(j3bVar.getContext());
                            j3bVar.x = view3;
                            linearLayout.addView(view3, qoe.t(-1, -2, 0, 21, 0, 0, 0));
                            view3.getLayoutParams().height = 1;
                            anb.h(cmb.c7, null, view3);
                            vkb vkbVar = new vkb(j3bVar.getContext());
                            j3bVar.E = vkbVar;
                            linearLayout.addView(vkbVar, qoe.o(-1, -2));
                            view = j3bVar;
                            break;
                        case 3:
                            view = new jf5(context);
                            break;
                        case 4:
                            hla hlaVar = new hla(context, null);
                            hlaVar.setCallback(new qn0((byte) 14));
                            int i3 = gda.F;
                            hlaVar.b(i3 == 3 ? 0 : i3 + 1, null, jb6.G(3, "Days", new Object[0]), jb6.G(1, "Weeks", new Object[0]), jb6.G(1, "Months", new Object[0]), jb6.M0(2131748816, null));
                            view = hlaVar;
                            break;
                        case 5:
                            view = new x71(y71Var.getParentActivity(), y71Var.getResourceProvider());
                            break;
                        case 6:
                            tk4 tk4Var = new tk4(y71Var.getParentActivity(), null);
                            tk4Var.setIsSingleCell(true);
                            tk4Var.setItemsCount(3);
                            tk4Var.setIgnoreHeightCheck(true);
                            tk4Var.setViewType(25);
                            view = tk4Var;
                            break;
                        case 7:
                            view = new xib(context);
                            break;
                        case 8:
                            fja fjaVar = y71Var.c0;
                            fjaVar.getClass();
                            View xd9Var2 = new xd9((byte) 7, context, fjaVar);
                            xd9Var2.setTag(-33024);
                            xd9Var2.setLayoutParams(new g69(-1, -1));
                            view2 = xd9Var2;
                            view = view2;
                            break;
                        case 9:
                            v71 v71Var = new v71(this, context);
                            y71Var.X = v71Var;
                            v71Var.setTag(-33024);
                            view2 = v71Var;
                            view = view2;
                            break;
                        case 10:
                            m71 m71Var = new m71(y71Var, context);
                            y71Var.Y = m71Var;
                            m71Var.setTag(-33024);
                            view = m71Var;
                            break;
                        case 11:
                            view2 = new oh2(this.e, 4, 21, false, y71Var.getResourceProvider());
                            view = view2;
                            break;
                        case 12:
                            tk4 tk4Var2 = new tk4(y71Var.getParentActivity(), null);
                            tk4Var2.setIsSingleCell(true);
                            tk4Var2.setItemsCount(1);
                            tk4Var2.setIgnoreHeightCheck(true);
                            tk4Var2.setViewType(26);
                            view = tk4Var2;
                            break;
                        case 13:
                            q71 q71Var = new q71(y71Var, context);
                            y71Var.Z = q71Var;
                            view = q71Var;
                            break;
                        case 14:
                            hla hlaVar2 = new hla(context, null);
                            float f = ((int) ((y71Var.I / 1024) / 1024)) / 1000.0f;
                            ArrayList arrayList = new ArrayList();
                            if (f <= 17.0f) {
                                arrayList.add(2);
                            }
                            if (f > 5.0f) {
                                arrayList.add(5);
                            }
                            if (f > 16.0f) {
                                arrayList.add(16);
                            }
                            if (f > 32.0f) {
                                arrayList.add(32);
                            }
                            arrayList.add(Integer.valueOf(ConnectionsManager.DEFAULT_DATACENTER_ID));
                            String[] strArr = new String[arrayList.size()];
                            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                if (((Integer) arrayList.get(i4)).intValue() == 1) {
                                    strArr[i4] = "300 MB";
                                } else if (((Integer) arrayList.get(i4)).intValue() == Integer.MAX_VALUE) {
                                    strArr[i4] = jb6.M0(2131747936, null);
                                } else {
                                    strArr[i4] = String.format("%d GB", arrayList.get(i4));
                                }
                            }
                            hlaVar2.setCallback(new xg0(arrayList, b2));
                            int indexOf2 = arrayList.indexOf(Integer.valueOf(gda.q().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID)));
                            if (indexOf2 < 0) {
                                indexOf2 = arrayList.size() - 1;
                            }
                            hlaVar2.b(indexOf2, null, strArr);
                            view = hlaVar2;
                            break;
                        default:
                            view = new njb(context);
                            break;
                    }
                } else {
                    view = new vkb(context);
                }
                return new b59(view);
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) dVar;
                switch (i) {
                    case 0:
                        yn7Var = new jf5(context);
                        break;
                    case 1:
                        yn7Var = new bjb(context);
                        break;
                    case 2:
                        yn7Var = new w8c(context, 6, 0, false);
                        break;
                    case 3:
                        yn7Var = new djb(context, null);
                        break;
                    case 4:
                        yn7Var = new njb(context);
                        break;
                    case 5:
                        yn7Var = new vkb(context);
                        break;
                    case 6:
                        ylbVar = ((d) notificationsCustomSettingsActivity).resourceProvider;
                        yn7Var = new yn7(this.e, 21, 64, true, ylbVar);
                        break;
                    case 7:
                    default:
                        yn7Var = new xib(context);
                        break;
                    case 8:
                        to7 to7Var = new to7(context);
                        ImageView imageView = new ImageView(context);
                        to7Var.a0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        anb.s(imageView, cmb.u6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(R.drawable.msg_expand);
                        to7Var.addView(imageView, qoe.d(24, 24.0f, (jb6.a0 ? 3 : 5) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                        yn7Var = to7Var;
                        break;
                }
                return new b59(yn7Var);
        }
    }

    @Override // y59
    public final void y(u69 u69Var) {
        boolean v;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.d) {
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f;
                ArrayList arrayList3 = notificationsCustomSettingsActivity.J;
                int i = notificationsCustomSettingsActivity.s;
                if (i == 3 || ((arrayList2 = notificationsCustomSettingsActivity.x) != null && arrayList2.isEmpty())) {
                    if (i == 3) {
                        Boolean bool = notificationsCustomSettingsActivity.n;
                        v = bool == null || bool.booleanValue() || !((arrayList = notificationsCustomSettingsActivity.x) == null || arrayList.isEmpty());
                    } else {
                        v = notificationsCustomSettingsActivity.getNotificationsController().v(i);
                    }
                    int b = u69Var.b();
                    View view = u69Var.a;
                    uo7 uo7Var = (b < 0 || b >= arrayList3.size()) ? null : (uo7) arrayList3.get(b);
                    if (uo7Var == null || uo7Var.c != 102) {
                        int i2 = u69Var.f;
                        if (i2 == 0) {
                            ((jf5) view).a(null, v);
                            break;
                        } else if (i2 == 1) {
                            ((bjb) view).e(null, v);
                            break;
                        } else if (i2 == 3) {
                            ((djb) view).a(null, v);
                            break;
                        } else if (i2 == 5) {
                            ((vkb) view).a(null, v);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
