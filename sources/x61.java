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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class x61 extends la {
    public final /* synthetic */ byte d;
    public final Context e;
    public final /* synthetic */ e f;

    public /* synthetic */ x61(e eVar, Context context, byte b) {
        this.d = b;
        this.f = eVar;
        this.e = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i;
        switch (this.d) {
            case 0:
                long b = f89Var.b();
                z61 z61Var = (z61) this.f;
                if (b == z61Var.K || (((i = f89Var.f) == 2 && z61Var.H > 0 && !z61Var.L) || i == 5 || i == 7 || i == 11)) {
                    break;
                }
                break;
            default:
                int i2 = f89Var.f;
                if (i2 != 0 && i2 != 4) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // j79
    public final int b() {
        byte b = this.d;
        e eVar = this.f;
        switch (b) {
            case 0:
                return ((z61) eVar).g0.size();
            default:
                return ((NotificationsCustomSettingsActivity) eVar).J.size();
        }
    }

    @Override // j79
    public final int d(int i) {
        byte b = this.d;
        e eVar = this.f;
        switch (b) {
            case 0:
                return ((v61) ((z61) eVar).g0.get(i)).a;
            default:
                ArrayList arrayList = ((NotificationsCustomSettingsActivity) eVar).J;
                if (i < 0 || i >= arrayList.size()) {
                    return 5;
                }
                return ((qp7) arrayList.get(i)).a;
        }
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        int i2;
        skb skbVar;
        byte b = this.d;
        e eVar = this.f;
        switch (b) {
            case 0:
                z61 z61Var = (z61) eVar;
                ArrayList arrayList = z61Var.g0;
                v61 v61Var = (v61) arrayList.get(i);
                int i3 = f89Var.f;
                View view = f89Var.a;
                if (i3 == 0) {
                    qmb qmbVar = (qmb) view;
                    if (i == z61Var.K) {
                        qmbVar.c(ob6.M0(2131748188, null), null, false, false);
                        break;
                    }
                } else if (i3 == 1) {
                    ((ilb) view).setText(hl.S2(v61Var.e));
                    break;
                } else if (i3 == 2) {
                    final e5b e5bVar = (e5b) view;
                    boolean z = z61Var.L;
                    long j = z61Var.e;
                    long j2 = z61Var.H;
                    long j3 = z61Var.J;
                    long j4 = z61Var.I;
                    vh4 vh4Var = e5bVar.J;
                    View view2 = e5bVar.x;
                    TextView textView = e5bVar.n;
                    TextView textView2 = e5bVar.h;
                    TextView textView3 = e5bVar.w;
                    qmb qmbVar2 = e5bVar.E;
                    e5bVar.e = z;
                    TextView textView4 = e5bVar.r;
                    textView4.setText(ob6.a0("TotalDeviceFreeSize", null, 2131743628, hl.i0(j3, false, false)));
                    TextView textView5 = e5bVar.s;
                    long j5 = j4 - j3;
                    textView5.setText(ob6.a0("TotalDeviceSize", null, 2131743627, hl.i0(j5, false, false)));
                    if (z) {
                        textView3.setVisibility(0);
                        textView2.setVisibility(8);
                        textView4.setVisibility(8);
                        textView5.setVisibility(8);
                        textView.setVisibility(8);
                        view2.setVisibility(8);
                        qmbVar2.setVisibility(8);
                        e5bVar.F = 0.0f;
                        e5bVar.G = 0.0f;
                        if (vh4Var != null) {
                            vh4Var.c(textView3);
                        }
                    } else {
                        if (vh4Var != null) {
                            vh4Var.F(textView3);
                        }
                        textView3.setVisibility(8);
                        if (j2 > 0) {
                            i2 = 0;
                            view2.setVisibility(0);
                            qmbVar2.setVisibility(0);
                            textView2.setVisibility(0);
                            textView.setVisibility(8);
                            qmbVar2.c(ob6.M0(2131752012, null), hl.i0(j2, false, false), false, true);
                            textView2.setText(ob6.a0("TelegramCacheSize", null, 2131743899, hl.i0(j2 + j, false, false)));
                        } else {
                            i2 = 0;
                            textView2.setVisibility(8);
                            textView.setVisibility(0);
                            textView.setText(ob6.a0("LocalDatabaseSize", null, 2131748523, hl.i0(j, false, false)));
                            view2.setVisibility(8);
                            qmbVar2.setVisibility(8);
                        }
                        textView4.setVisibility(i2);
                        textView5.setVisibility(i2);
                        float f = j2 + j;
                        float f2 = j4;
                        float f3 = f / f2;
                        float f4 = j5 / f2;
                        if (e5bVar.F != f3) {
                            ValueAnimator valueAnimator = e5bVar.H;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            final byte b2 = 0;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(e5bVar.F, f3);
                            e5bVar.H = ofFloat;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: d5b
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    byte b3 = b2;
                                    e5b e5bVar2 = e5bVar;
                                    e5bVar2.getClass();
                                    switch (b3) {
                                        case 0:
                                            e5bVar2.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            e5bVar2.invalidate();
                                            break;
                                        default:
                                            e5bVar2.G = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            e5bVar2.invalidate();
                                            break;
                                    }
                                }
                            });
                            e5bVar.H.start();
                        }
                        if (e5bVar.G != f4) {
                            ValueAnimator valueAnimator2 = e5bVar.I;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            final byte b3 = 1;
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(e5bVar.G, f4);
                            e5bVar.I = ofFloat2;
                            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: d5b
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                    byte b32 = b3;
                                    e5b e5bVar2 = e5bVar;
                                    e5bVar2.getClass();
                                    switch (b32) {
                                        case 0:
                                            e5bVar2.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                            e5bVar2.invalidate();
                                            break;
                                        default:
                                            e5bVar2.G = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                            e5bVar2.invalidate();
                                            break;
                                    }
                                }
                            });
                            e5bVar.I.start();
                        }
                    }
                    yob.X(qmbVar2.getTextView(), aob.G6, null);
                    e5bVar.requestLayout();
                    break;
                } else if (i3 == 3) {
                    mf5 mf5Var = (mf5) view;
                    mf5Var.setText(((v61) arrayList.get(i)).d);
                    ((v61) arrayList.get(i)).getClass();
                    mf5Var.setTopMargin(15);
                    ((v61) arrayList.get(i)).getClass();
                    mf5Var.setBottomMargin(0);
                    break;
                } else if (i3 == 7) {
                    skb skbVar2 = (skb) view;
                    w51 w51Var = z61Var.getMessagesController().h4;
                    int i4 = v61Var.c;
                    int size = w51Var.d(((v61) arrayList.get(i)).c).size();
                    String G = size > 0 ? ob6.G(size, "ExceptionShort", Integer.valueOf(size)) : null;
                    String f5 = w51.f(w51Var.c(i4));
                    if (((v61) arrayList.get(i)).c == 0) {
                        skbVar = skbVar2;
                        skbVar.r(ob6.M0(2131746482, null), f5, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                    } else {
                        skbVar = skbVar2;
                        if (((v61) arrayList.get(i)).c == 1) {
                            skbVar.r(ob6.M0(2131749211, null), f5, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                        } else if (((v61) arrayList.get(i)).c == 2) {
                            skbVar.r(ob6.M0(2131752631, null), f5, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                        } else if (((v61) arrayList.get(i)).c == 3) {
                            skbVar.r(ob6.M0(2131752627, null), f5, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                        }
                    }
                    skbVar.setSubtitle(G);
                    break;
                } else {
                    switch (i3) {
                        case 9:
                            z61Var.y0();
                            break;
                        case 10:
                            n61 n61Var = z61Var.Y;
                            if (n61Var != null && !z61Var.L) {
                                long j6 = z61Var.H;
                                boolean z2 = j6 > 0;
                                long j7 = z61Var.I;
                                n61Var.b(j7 <= 0 ? 0.0f : j6 / j7, (z61Var.J <= 0 || j7 <= 0) ? 0.0f : (j7 - r9) / j7, z2);
                                break;
                            }
                            break;
                        case 11:
                            sg2 sg2Var = (sg2) view;
                            int i5 = v61Var.f;
                            boolean n0 = i5 < 0 ? z61Var.n0() : z61Var.d[i5];
                            String str = v61Var.d;
                            int[] iArr = z61Var.V;
                            int i6 = v61Var.f;
                            if (i6 < 0) {
                                i6 = 9;
                            }
                            int i7 = iArr[i6];
                            SpannableString spannableString = new SpannableString(i7 <= 0 ? String.format("<%.1f%%", Float.valueOf(1.0f)) : String.format("%d%%", Integer.valueOf(i7)));
                            spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                            spannableString.setSpan(new y7c(hl.o()), 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                            spannableStringBuilder.append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) spannableString);
                            sg2Var.e(spannableStringBuilder, hl.i0(v61Var.g, false, false), n0, v61Var.f >= 0 ? !v61Var.j : !z61Var.M, false);
                            int i8 = v61Var.h;
                            int i9 = aob.k7;
                            og2 og2Var = sg2Var.r;
                            if (og2Var != null) {
                                og2Var.b(i8, i8, i9);
                            }
                            sg2Var.setCollapsed(v61Var.f < 0 ? Boolean.valueOf(z61Var.M) : null);
                            if (v61Var.f == -1) {
                                sg2Var.d(new k1(this, (byte) 28), new t(this, sg2Var, (byte) 27));
                            } else {
                                sg2Var.d(null, null);
                            }
                            sg2Var.setPad(v61Var.i ? 1 : 0);
                            break;
                    }
                }
                break;
            default:
                ArrayList arrayList2 = ((NotificationsCustomSettingsActivity) eVar).J;
                if (i >= 0 && i < arrayList2.size()) {
                    qp7 qp7Var = (qp7) arrayList2.get(i);
                    int i10 = i + 1;
                    boolean z3 = i10 < arrayList2.size() && ((qp7) arrayList2.get(i10)).a != 4;
                    int i11 = f89Var.f;
                    View view3 = f89Var.a;
                    switch (i11) {
                        case 0:
                            ((mf5) view3).setText(qp7Var.e);
                            break;
                        case 1:
                            ((wkb) view3).f(String.valueOf(qp7Var.e), qp7Var.i, z3);
                            break;
                        case 2:
                            ((vac) view3).f(qp7Var.g, null, z3);
                            break;
                        case 3:
                            ((ykb) view3).b(qp7Var.h, String.valueOf(qp7Var.e), z3);
                            break;
                        case 4:
                            ilb ilbVar = (ilb) view3;
                            if (qp7Var.e != null) {
                                ilbVar.setFixedSize(0);
                                ilbVar.setText(qp7Var.e);
                                break;
                            } else {
                                ilbVar.setFixedSize(12);
                                ilbVar.setText(null);
                                break;
                            }
                        case 5:
                            ((qmb) view3).c(qp7Var.e, qp7Var.f, false, z3);
                            break;
                        case 6:
                            uo7 uo7Var = (uo7) view3;
                            uo7Var.setDrawLine(true);
                            uo7Var.setChecked(qp7Var.i);
                            uo7Var.b(qp7Var.e, qp7Var.f, qp7Var.d, qp7Var.i, 0, false, z3, true);
                            break;
                        case 7:
                            skb skbVar3 = (skb) view3;
                            if (qp7Var.d != 0) {
                                skbVar3.g(aob.v6, aob.u6);
                                skbVar3.o(qp7Var.d, String.valueOf(qp7Var.e), z3);
                                break;
                            } else {
                                skbVar3.g(-1, aob.p7);
                                skbVar3.k(String.valueOf(qp7Var.e), z3);
                                break;
                            }
                        case 8:
                            pp7 pp7Var = (pp7) view3;
                            pp7Var.g(aob.v6, aob.u6);
                            String str2 = qp7Var.e;
                            ik8.t(pp7Var.a0.animate().rotation(qp7Var.d == 1 ? 0.0f : 180.0f), k43.h, 340L);
                            pp7Var.k(str2, z3);
                            break;
                    }
                }
                break;
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        vnb vnbVar;
        FrameLayout uo7Var;
        byte b = this.d;
        Context context = this.e;
        e eVar = this.f;
        switch (b) {
            case 0:
                z61 z61Var = (z61) eVar;
                if (i != 0) {
                    switch (i) {
                        case 2:
                            e5b e5bVar = new e5b(context);
                            Paint paint = new Paint(1);
                            e5bVar.a = paint;
                            Paint paint2 = new Paint(1);
                            Paint paint3 = new Paint(1);
                            e5bVar.b = paint3;
                            Paint paint4 = new Paint(1);
                            e5bVar.c = paint4;
                            e5bVar.d = new Paint();
                            fe1 fe1Var = new fe1(jn7.w3, jn7.d4);
                            e5bVar.M = fe1Var;
                            e5bVar.setWillNotDraw(false);
                            fe1Var.k = false;
                            paint.setStrokeWidth(hl.L(6.0f));
                            paint2.setStrokeWidth(hl.L(6.0f));
                            paint3.setStrokeWidth(hl.L(6.0f));
                            paint4.setStrokeWidth(hl.L(6.0f));
                            Paint.Cap cap = Paint.Cap.ROUND;
                            paint.setStrokeCap(cap);
                            paint2.setStrokeCap(cap);
                            paint3.setStrokeCap(cap);
                            paint4.setStrokeCap(cap);
                            nf9 nf9Var = new nf9((byte) 11, context, e5bVar);
                            e5bVar.f = nf9Var;
                            e5bVar.addView(nf9Var, tre.c(-2.0f, -1));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            e5bVar.addView(linearLayout, tre.c(-2.0f, -1));
                            ir8 ir8Var = new ir8(context, (byte) 14);
                            linearLayout.addView(ir8Var, tre.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                            TextView textView = new TextView(context);
                            e5bVar.w = textView;
                            int i2 = aob.y6;
                            yob.X(textView, i2, null);
                            String M0 = ob6.M0(2131752624, "CalculatingSize");
                            int indexOf = M0.indexOf("...");
                            if (indexOf >= 0) {
                                SpannableString spannableString = new SpannableString(M0);
                                vh4 vh4Var = new vh4(textView);
                                e5bVar.J = vh4Var;
                                vh4Var.M(spannableString, indexOf);
                                textView.setText(spannableString);
                            } else {
                                textView.setText(M0);
                            }
                            TextView textView2 = new TextView(context);
                            e5bVar.h = textView2;
                            textView2.setCompoundDrawablePadding(hl.L(6.0f));
                            yob.X(textView2, i2, null);
                            TextView textView3 = new TextView(context);
                            e5bVar.n = textView3;
                            textView3.setCompoundDrawablePadding(hl.L(6.0f));
                            yob.X(textView3, i2, null);
                            TextView textView4 = new TextView(context);
                            e5bVar.r = textView4;
                            textView4.setCompoundDrawablePadding(hl.L(6.0f));
                            yob.X(textView4, i2, null);
                            TextView textView5 = new TextView(context);
                            e5bVar.s = textView5;
                            textView5.setCompoundDrawablePadding(hl.L(6.0f));
                            yob.X(textView5, i2, null);
                            e5bVar.y = aob.w0(null, aob.Mj, false);
                            textView2.setCompoundDrawablesWithIntrinsicBounds(aob.K(hl.L(10.0f), e5bVar.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView2.setCompoundDrawablePadding(hl.L(6.0f));
                            textView4.setCompoundDrawablesWithIntrinsicBounds(aob.K(hl.L(10.0f), vm2.o(e5bVar.y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView4.setCompoundDrawablePadding(hl.L(6.0f));
                            textView5.setCompoundDrawablesWithIntrinsicBounds(aob.K(hl.L(10.0f), vm2.o(e5bVar.y, jn7.K1)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView5.setCompoundDrawablePadding(hl.L(6.0f));
                            textView3.setCompoundDrawablesWithIntrinsicBounds(aob.K(hl.L(10.0f), e5bVar.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView3.setCompoundDrawablePadding(hl.L(6.0f));
                            ir8Var.addView(textView, tre.c(-2.0f, -2));
                            ir8Var.addView(textView3, tre.c(-2.0f, -2));
                            ir8Var.addView(textView2, tre.c(-2.0f, -2));
                            ir8Var.addView(textView5, tre.c(-2.0f, -2));
                            ir8Var.addView(textView4, tre.c(-2.0f, -2));
                            View view3 = new View(e5bVar.getContext());
                            e5bVar.x = view3;
                            linearLayout.addView(view3, tre.t(-1, -2, 0, 21, 0, 0, 0));
                            view3.getLayoutParams().height = 1;
                            yob.h(aob.d7, null, view3);
                            qmb qmbVar = new qmb(e5bVar.getContext());
                            e5bVar.E = qmbVar;
                            linearLayout.addView(qmbVar, tre.o(-1, -2));
                            view = e5bVar;
                            break;
                        case 3:
                            view = new mf5(context);
                            break;
                        case 4:
                            zma zmaVar = new zma(context, null);
                            zmaVar.setCallback(new rm0((byte) 15));
                            int i3 = xea.F;
                            zmaVar.b(i3 == 3 ? 0 : i3 + 1, null, ob6.G(3, "Days", new Object[0]), ob6.G(1, "Weeks", new Object[0]), ob6.G(1, "Months", new Object[0]), ob6.M0(2131748813, null));
                            view = zmaVar;
                            break;
                        case 5:
                            view = new y61(z61Var.getParentActivity(), z61Var.getResourceProvider());
                            break;
                        case 6:
                            tk4 tk4Var = new tk4(z61Var.getParentActivity(), null);
                            tk4Var.setIsSingleCell(true);
                            tk4Var.setItemsCount(3);
                            tk4Var.setIgnoreHeightCheck(true);
                            tk4Var.setViewType(25);
                            view = tk4Var;
                            break;
                        case 7:
                            view = new skb(context);
                            break;
                        case 8:
                            wka wkaVar = z61Var.c0;
                            wkaVar.getClass();
                            View nf9Var2 = new nf9((byte) 7, context, wkaVar);
                            nf9Var2.setTag(-33024);
                            nf9Var2.setLayoutParams(new r79(-1, -1));
                            view2 = nf9Var2;
                            view = view2;
                            break;
                        case 9:
                            w61 w61Var = new w61(this, context);
                            z61Var.X = w61Var;
                            w61Var.setTag(-33024);
                            view2 = w61Var;
                            view = view2;
                            break;
                        case 10:
                            n61 n61Var = new n61(z61Var, context);
                            z61Var.Y = n61Var;
                            n61Var.setTag(-33024);
                            view = n61Var;
                            break;
                        case 11:
                            view2 = new sg2(this.e, 4, 21, false, z61Var.getResourceProvider());
                            view = view2;
                            break;
                        case 12:
                            tk4 tk4Var2 = new tk4(z61Var.getParentActivity(), null);
                            tk4Var2.setIsSingleCell(true);
                            tk4Var2.setItemsCount(1);
                            tk4Var2.setIgnoreHeightCheck(true);
                            tk4Var2.setViewType(26);
                            view = tk4Var2;
                            break;
                        case 13:
                            r61 r61Var = new r61(z61Var, context);
                            z61Var.Z = r61Var;
                            view = r61Var;
                            break;
                        case 14:
                            zma zmaVar2 = new zma(context, null);
                            float f = ((int) ((z61Var.I / 1024) / 1024)) / 1000.0f;
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
                                    strArr[i4] = ob6.M0(2131747933, null);
                                } else {
                                    strArr[i4] = String.format("%d GB", arrayList.get(i4));
                                }
                            }
                            zmaVar2.setCallback(new tg0(arrayList, (byte) 23));
                            int indexOf2 = arrayList.indexOf(Integer.valueOf(xea.q().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID)));
                            if (indexOf2 < 0) {
                                indexOf2 = arrayList.size() - 1;
                            }
                            zmaVar2.b(indexOf2, null, strArr);
                            view = zmaVar2;
                            break;
                        default:
                            view = new ilb(context);
                            break;
                    }
                } else {
                    view = new qmb(context);
                }
                return new n69(view);
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) eVar;
                switch (i) {
                    case 0:
                        uo7Var = new mf5(context);
                        break;
                    case 1:
                        uo7Var = new wkb(context);
                        break;
                    case 2:
                        uo7Var = new vac(context, 6, 0, false);
                        break;
                    case 3:
                        uo7Var = new ykb(context, null);
                        break;
                    case 4:
                        uo7Var = new ilb(context);
                        break;
                    case 5:
                        uo7Var = new qmb(context);
                        break;
                    case 6:
                        vnbVar = ((e) notificationsCustomSettingsActivity).resourceProvider;
                        uo7Var = new uo7(this.e, 21, 64, true, vnbVar);
                        break;
                    case 7:
                    default:
                        uo7Var = new skb(context);
                        break;
                    case 8:
                        pp7 pp7Var = new pp7(context);
                        ImageView imageView = new ImageView(context);
                        pp7Var.a0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        yob.s(imageView, aob.v6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(R.drawable.msg_expand);
                        pp7Var.addView(imageView, tre.d(24, 24.0f, (ob6.a0 ? 3 : 5) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                        uo7Var = pp7Var;
                        break;
                }
                return new n69(uo7Var);
        }
    }

    @Override // j79
    public final void y(f89 f89Var) {
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
                    int b = f89Var.b();
                    View view = f89Var.a;
                    qp7 qp7Var = (b < 0 || b >= arrayList3.size()) ? null : (qp7) arrayList3.get(b);
                    if (qp7Var == null || qp7Var.c != 102) {
                        int i2 = f89Var.f;
                        if (i2 == 0) {
                            ((mf5) view).a(null, v);
                            break;
                        } else if (i2 == 1) {
                            ((wkb) view).e(null, v);
                            break;
                        } else if (i2 == 3) {
                            ((ykb) view).a(null, v);
                            break;
                        } else if (i2 == 5) {
                            ((qmb) view).a(null, v);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
