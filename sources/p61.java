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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class p61 extends ka {
    public final /* synthetic */ byte d;
    public final Context e;
    public final /* synthetic */ d f;

    public /* synthetic */ p61(d dVar, Context context, byte b) {
        this.d = b;
        this.f = dVar;
        this.e = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i;
        switch (this.d) {
            case 0:
                long b = s49Var.b();
                r61 r61Var = (r61) this.f;
                if (b == r61Var.K || (((i = s49Var.f) == 2 && r61Var.H > 0 && !r61Var.L) || i == 5 || i == 7 || i == 11)) {
                    break;
                }
                break;
            default:
                int i2 = s49Var.f;
                if (i2 != 0 && i2 != 4) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // w39
    public final int b() {
        byte b = this.d;
        d dVar = this.f;
        switch (b) {
            case 0:
                return ((r61) dVar).g0.size();
            default:
                return ((NotificationsCustomSettingsActivity) dVar).J.size();
        }
    }

    @Override // w39
    public final int d(int i) {
        byte b = this.d;
        d dVar = this.f;
        switch (b) {
            case 0:
                return ((n61) ((r61) dVar).g0.get(i)).a;
            default:
                ArrayList arrayList = ((NotificationsCustomSettingsActivity) dVar).J;
                if (i < 0 || i >= arrayList.size()) {
                    return 5;
                }
                return ((qm7) arrayList.get(i)).a;
        }
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2;
        wgb wgbVar;
        byte b = this.d;
        d dVar = this.f;
        switch (b) {
            case 0:
                r61 r61Var = (r61) dVar;
                ArrayList arrayList = r61Var.g0;
                n61 n61Var = (n61) arrayList.get(i);
                int i3 = s49Var.f;
                View view = s49Var.a;
                if (i3 == 0) {
                    uib uibVar = (uib) view;
                    if (i == r61Var.K) {
                        uibVar.c(k96.M0(2131748242, null), null, false, false);
                        break;
                    }
                } else if (i3 == 1) {
                    ((mhb) view).setText(gl.S2(n61Var.e));
                    break;
                } else if (i3 == 2) {
                    final h1b h1bVar = (h1b) view;
                    boolean z = r61Var.L;
                    long j = r61Var.e;
                    long j2 = r61Var.H;
                    long j3 = r61Var.J;
                    long j4 = r61Var.I;
                    xf4 xf4Var = h1bVar.J;
                    View view2 = h1bVar.x;
                    TextView textView = h1bVar.n;
                    TextView textView2 = h1bVar.h;
                    TextView textView3 = h1bVar.w;
                    uib uibVar2 = h1bVar.E;
                    h1bVar.e = z;
                    TextView textView4 = h1bVar.r;
                    textView4.setText(k96.a0("TotalDeviceFreeSize", null, 2131743734, gl.i0(j3, false, false)));
                    TextView textView5 = h1bVar.s;
                    long j5 = j4 - j3;
                    textView5.setText(k96.a0("TotalDeviceSize", null, 2131743733, gl.i0(j5, false, false)));
                    if (z) {
                        textView3.setVisibility(0);
                        textView2.setVisibility(8);
                        textView4.setVisibility(8);
                        textView5.setVisibility(8);
                        textView.setVisibility(8);
                        view2.setVisibility(8);
                        uibVar2.setVisibility(8);
                        h1bVar.F = 0.0f;
                        h1bVar.G = 0.0f;
                        if (xf4Var != null) {
                            xf4Var.d(textView3);
                        }
                    } else {
                        if (xf4Var != null) {
                            xf4Var.F(textView3);
                        }
                        textView3.setVisibility(8);
                        if (j2 > 0) {
                            i2 = 0;
                            view2.setVisibility(0);
                            uibVar2.setVisibility(0);
                            textView2.setVisibility(0);
                            textView.setVisibility(8);
                            uibVar2.c(k96.M0(2131752035, null), gl.i0(j2, false, false), false, true);
                            textView2.setText(k96.a0("TelegramCacheSize", null, 2131744005, gl.i0(j2 + j, false, false)));
                        } else {
                            i2 = 0;
                            textView2.setVisibility(8);
                            textView.setVisibility(0);
                            textView.setText(k96.a0("LocalDatabaseSize", null, 2131748577, gl.i0(j, false, false)));
                            view2.setVisibility(8);
                            uibVar2.setVisibility(8);
                        }
                        textView4.setVisibility(i2);
                        textView5.setVisibility(i2);
                        float f = j2 + j;
                        float f2 = j4;
                        float f3 = f / f2;
                        float f4 = j5 / f2;
                        if (h1bVar.F != f3) {
                            ValueAnimator valueAnimator = h1bVar.H;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            final byte b2 = 0;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(h1bVar.F, f3);
                            h1bVar.H = ofFloat;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: g1b
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    byte b3 = b2;
                                    h1b h1bVar2 = h1bVar;
                                    h1bVar2.getClass();
                                    switch (b3) {
                                        case 0:
                                            h1bVar2.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            h1bVar2.invalidate();
                                            break;
                                        default:
                                            h1bVar2.G = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            h1bVar2.invalidate();
                                            break;
                                    }
                                }
                            });
                            h1bVar.H.start();
                        }
                        if (h1bVar.G != f4) {
                            ValueAnimator valueAnimator2 = h1bVar.I;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            final byte b3 = 1;
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(h1bVar.G, f4);
                            h1bVar.I = ofFloat2;
                            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: g1b
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                    byte b32 = b3;
                                    h1b h1bVar2 = h1bVar;
                                    h1bVar2.getClass();
                                    switch (b32) {
                                        case 0:
                                            h1bVar2.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                            h1bVar2.invalidate();
                                            break;
                                        default:
                                            h1bVar2.G = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                            h1bVar2.invalidate();
                                            break;
                                    }
                                }
                            });
                            h1bVar.I.start();
                        }
                    }
                    zkb.X(uibVar2.getTextView(), bkb.F6, null);
                    h1bVar.requestLayout();
                    break;
                } else if (i3 == 3) {
                    ld5 ld5Var = (ld5) view;
                    ld5Var.setText(((n61) arrayList.get(i)).d);
                    ((n61) arrayList.get(i)).getClass();
                    ld5Var.setTopMargin(15);
                    ((n61) arrayList.get(i)).getClass();
                    ld5Var.setBottomMargin(0);
                    break;
                } else if (i3 == 7) {
                    wgb wgbVar2 = (wgb) view;
                    o51 o51Var = r61Var.getMessagesController().h4;
                    int i4 = n61Var.c;
                    int size = o51Var.d(((n61) arrayList.get(i)).c).size();
                    String G = size > 0 ? k96.G(size, "ExceptionShort", Integer.valueOf(size)) : null;
                    String f5 = o51.f(o51Var.c(i4));
                    if (((n61) arrayList.get(i)).c == 0) {
                        wgbVar = wgbVar2;
                        wgbVar.r(k96.M0(2131746562, null), f5, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                    } else {
                        wgbVar = wgbVar2;
                        if (((n61) arrayList.get(i)).c == 1) {
                            wgbVar.r(k96.M0(2131749265, null), f5, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                        } else if (((n61) arrayList.get(i)).c == 2) {
                            wgbVar.r(k96.M0(2131752638, null), f5, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                        } else if (((n61) arrayList.get(i)).c == 3) {
                            wgbVar.r(k96.M0(2131752634, null), f5, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                        }
                    }
                    wgbVar.setSubtitle(G);
                    break;
                } else {
                    switch (i3) {
                        case 9:
                            r61Var.x0();
                            break;
                        case 10:
                            f61 f61Var = r61Var.Y;
                            if (f61Var != null && !r61Var.L) {
                                long j6 = r61Var.H;
                                boolean z2 = j6 > 0;
                                long j7 = r61Var.I;
                                f61Var.b(j7 <= 0 ? 0.0f : j6 / j7, (r61Var.J <= 0 || j7 <= 0) ? 0.0f : (j7 - r9) / j7, z2);
                                break;
                            }
                            break;
                        case 11:
                            ag2 ag2Var = (ag2) view;
                            int i5 = n61Var.f;
                            boolean n0 = i5 < 0 ? r61Var.n0() : r61Var.d[i5];
                            String str = n61Var.d;
                            int[] iArr = r61Var.V;
                            int i6 = n61Var.f;
                            if (i6 < 0) {
                                i6 = 9;
                            }
                            int i7 = iArr[i6];
                            SpannableString spannableString = new SpannableString(i7 <= 0 ? String.format("<%.1f%%", Float.valueOf(1.0f)) : String.format("%d%%", Integer.valueOf(i7)));
                            spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                            spannableString.setSpan(new z3c(gl.o()), 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                            spannableStringBuilder.append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) spannableString);
                            ag2Var.e(spannableStringBuilder, gl.i0(n61Var.g, false, false), n0, n61Var.f >= 0 ? !n61Var.j : !r61Var.M, false);
                            int i8 = n61Var.h;
                            int i9 = bkb.j7;
                            wf2 wf2Var = ag2Var.r;
                            if (wf2Var != null) {
                                wf2Var.b(i8, i8, i9);
                            }
                            ag2Var.setCollapsed(n61Var.f < 0 ? Boolean.valueOf(r61Var.M) : null);
                            if (n61Var.f == -1) {
                                ag2Var.d(new j1(this, (byte) 26), new t(this, ag2Var, (byte) 27));
                            } else {
                                ag2Var.d(null, null);
                            }
                            ag2Var.setPad(n61Var.i ? 1 : 0);
                            break;
                    }
                }
                break;
            default:
                ArrayList arrayList2 = ((NotificationsCustomSettingsActivity) dVar).J;
                if (i >= 0 && i < arrayList2.size()) {
                    qm7 qm7Var = (qm7) arrayList2.get(i);
                    int i10 = i + 1;
                    boolean z3 = i10 < arrayList2.size() && ((qm7) arrayList2.get(i10)).a != 4;
                    int i11 = s49Var.f;
                    View view3 = s49Var.a;
                    switch (i11) {
                        case 0:
                            ((ld5) view3).setText(qm7Var.e);
                            break;
                        case 1:
                            ((ahb) view3).f(String.valueOf(qm7Var.e), qm7Var.i, z3);
                            break;
                        case 2:
                            ((v6c) view3).f(qm7Var.g, null, z3);
                            break;
                        case 3:
                            ((chb) view3).b(qm7Var.h, String.valueOf(qm7Var.e), z3);
                            break;
                        case 4:
                            mhb mhbVar = (mhb) view3;
                            if (qm7Var.e != null) {
                                mhbVar.setFixedSize(0);
                                mhbVar.setText(qm7Var.e);
                                break;
                            } else {
                                mhbVar.setFixedSize(12);
                                mhbVar.setText(null);
                                break;
                            }
                        case 5:
                            ((uib) view3).c(qm7Var.e, qm7Var.f, false, z3);
                            break;
                        case 6:
                            vl7 vl7Var = (vl7) view3;
                            vl7Var.setDrawLine(true);
                            vl7Var.setChecked(qm7Var.i);
                            vl7Var.b(qm7Var.e, qm7Var.f, qm7Var.d, qm7Var.i, 0, false, z3, true);
                            break;
                        case 7:
                            wgb wgbVar3 = (wgb) view3;
                            if (qm7Var.d != 0) {
                                wgbVar3.g(bkb.u6, bkb.t6);
                                wgbVar3.o(qm7Var.d, String.valueOf(qm7Var.e), z3);
                                break;
                            } else {
                                wgbVar3.g(-1, bkb.o7);
                                wgbVar3.k(String.valueOf(qm7Var.e), z3);
                                break;
                            }
                        case 8:
                            pm7 pm7Var = (pm7) view3;
                            pm7Var.g(bkb.u6, bkb.t6);
                            String str2 = qm7Var.e;
                            ug8.t(pm7Var.a0.animate().rotation(qm7Var.d == 1 ? 0.0f : 180.0f), s33.h, 340L);
                            pm7Var.k(str2, z3);
                            break;
                    }
                }
                break;
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        wjb wjbVar;
        FrameLayout vl7Var;
        byte b = this.d;
        byte b2 = 6;
        Context context = this.e;
        d dVar = this.f;
        switch (b) {
            case 0:
                r61 r61Var = (r61) dVar;
                if (i != 0) {
                    switch (i) {
                        case 2:
                            h1b h1bVar = new h1b(context);
                            Paint paint = new Paint(1);
                            h1bVar.a = paint;
                            Paint paint2 = new Paint(1);
                            Paint paint3 = new Paint(1);
                            h1bVar.b = paint3;
                            Paint paint4 = new Paint(1);
                            h1bVar.c = paint4;
                            h1bVar.d = new Paint();
                            wd1 wd1Var = new wd1(kk7.w3, kk7.d4);
                            h1bVar.M = wd1Var;
                            h1bVar.setWillNotDraw(false);
                            wd1Var.k = false;
                            paint.setStrokeWidth(gl.L(6.0f));
                            paint2.setStrokeWidth(gl.L(6.0f));
                            paint3.setStrokeWidth(gl.L(6.0f));
                            paint4.setStrokeWidth(gl.L(6.0f));
                            Paint.Cap cap = Paint.Cap.ROUND;
                            paint.setStrokeCap(cap);
                            paint2.setStrokeCap(cap);
                            paint3.setStrokeCap(cap);
                            paint4.setStrokeCap(cap);
                            si9 si9Var = new si9((byte) 10, context, h1bVar);
                            h1bVar.f = si9Var;
                            h1bVar.addView(si9Var, nme.c(-2.0f, -1));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            h1bVar.addView(linearLayout, nme.c(-2.0f, -1));
                            ar8 ar8Var = new ar8(context, (byte) 13);
                            linearLayout.addView(ar8Var, nme.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                            TextView textView = new TextView(context);
                            h1bVar.w = textView;
                            int i2 = bkb.x6;
                            zkb.X(textView, i2, null);
                            String M0 = k96.M0(2131752631, "CalculatingSize");
                            int indexOf = M0.indexOf("...");
                            if (indexOf >= 0) {
                                SpannableString spannableString = new SpannableString(M0);
                                xf4 xf4Var = new xf4(textView);
                                h1bVar.J = xf4Var;
                                xf4Var.M(spannableString, indexOf);
                                textView.setText(spannableString);
                            } else {
                                textView.setText(M0);
                            }
                            TextView textView2 = new TextView(context);
                            h1bVar.h = textView2;
                            textView2.setCompoundDrawablePadding(gl.L(6.0f));
                            zkb.X(textView2, i2, null);
                            TextView textView3 = new TextView(context);
                            h1bVar.n = textView3;
                            textView3.setCompoundDrawablePadding(gl.L(6.0f));
                            zkb.X(textView3, i2, null);
                            TextView textView4 = new TextView(context);
                            h1bVar.r = textView4;
                            textView4.setCompoundDrawablePadding(gl.L(6.0f));
                            zkb.X(textView4, i2, null);
                            TextView textView5 = new TextView(context);
                            h1bVar.s = textView5;
                            textView5.setCompoundDrawablePadding(gl.L(6.0f));
                            zkb.X(textView5, i2, null);
                            h1bVar.y = bkb.w0(null, bkb.Lj, false);
                            textView2.setCompoundDrawablesWithIntrinsicBounds(bkb.K(gl.L(10.0f), h1bVar.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView2.setCompoundDrawablePadding(gl.L(6.0f));
                            textView4.setCompoundDrawablesWithIntrinsicBounds(bkb.K(gl.L(10.0f), bm2.o(h1bVar.y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView4.setCompoundDrawablePadding(gl.L(6.0f));
                            textView5.setCompoundDrawablesWithIntrinsicBounds(bkb.K(gl.L(10.0f), bm2.o(h1bVar.y, kk7.K1)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView5.setCompoundDrawablePadding(gl.L(6.0f));
                            textView3.setCompoundDrawablesWithIntrinsicBounds(bkb.K(gl.L(10.0f), h1bVar.y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView3.setCompoundDrawablePadding(gl.L(6.0f));
                            ar8Var.addView(textView, nme.c(-2.0f, -2));
                            ar8Var.addView(textView3, nme.c(-2.0f, -2));
                            ar8Var.addView(textView2, nme.c(-2.0f, -2));
                            ar8Var.addView(textView5, nme.c(-2.0f, -2));
                            ar8Var.addView(textView4, nme.c(-2.0f, -2));
                            View view3 = new View(h1bVar.getContext());
                            h1bVar.x = view3;
                            linearLayout.addView(view3, nme.t(-1, -2, 0, 21, 0, 0, 0));
                            view3.getLayoutParams().height = 1;
                            zkb.h(bkb.c7, null, view3);
                            uib uibVar = new uib(h1bVar.getContext());
                            h1bVar.E = uibVar;
                            linearLayout.addView(uibVar, nme.o(-1, -2));
                            view = h1bVar;
                            break;
                        case 3:
                            view = new ld5(context);
                            break;
                        case 4:
                            fja fjaVar = new fja(context, null);
                            fjaVar.setCallback(new qm0((byte) 14));
                            int i3 = gba.F;
                            fjaVar.b(i3 == 3 ? 0 : i3 + 1, null, k96.G(3, "Days", new Object[0]), k96.G(1, "Weeks", new Object[0]), k96.G(1, "Months", new Object[0]), k96.M0(2131748867, null));
                            view = fjaVar;
                            break;
                        case 5:
                            view = new q61(r61Var.getParentActivity(), r61Var.getResourceProvider());
                            break;
                        case 6:
                            pi4 pi4Var = new pi4(r61Var.getParentActivity(), null);
                            pi4Var.setIsSingleCell(true);
                            pi4Var.setItemsCount(3);
                            pi4Var.setIgnoreHeightCheck(true);
                            pi4Var.setViewType(25);
                            view = pi4Var;
                            break;
                        case 7:
                            view = new wgb(context);
                            break;
                        case 8:
                            dha dhaVar = r61Var.c0;
                            dhaVar.getClass();
                            View si9Var2 = new si9(b2, context, dhaVar);
                            si9Var2.setTag(-33024);
                            si9Var2.setLayoutParams(new e49(-1, -1));
                            view = si9Var2;
                            break;
                        case 9:
                            o61 o61Var = new o61(this, context);
                            r61Var.X = o61Var;
                            o61Var.setTag(-33024);
                            view2 = o61Var;
                            view = view2;
                            break;
                        case 10:
                            f61 f61Var = new f61(r61Var, context);
                            r61Var.Y = f61Var;
                            f61Var.setTag(-33024);
                            view = f61Var;
                            break;
                        case 11:
                            view2 = new ag2(this.e, 4, 21, false, r61Var.getResourceProvider());
                            view = view2;
                            break;
                        case 12:
                            pi4 pi4Var2 = new pi4(r61Var.getParentActivity(), null);
                            pi4Var2.setIsSingleCell(true);
                            pi4Var2.setItemsCount(1);
                            pi4Var2.setIgnoreHeightCheck(true);
                            pi4Var2.setViewType(26);
                            view = pi4Var2;
                            break;
                        case 13:
                            j61 j61Var = new j61(r61Var, context);
                            r61Var.Z = j61Var;
                            view = j61Var;
                            break;
                        case 14:
                            fja fjaVar2 = new fja(context, null);
                            float f = ((int) ((r61Var.I / 1024) / 1024)) / 1000.0f;
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
                                    strArr[i4] = k96.M0(2131748010, null);
                                } else {
                                    strArr[i4] = String.format("%d GB", arrayList.get(i4));
                                }
                            }
                            fjaVar2.setCallback(new sg0(arrayList, (byte) 22));
                            int indexOf2 = arrayList.indexOf(Integer.valueOf(gba.q().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID)));
                            if (indexOf2 < 0) {
                                indexOf2 = arrayList.size() - 1;
                            }
                            fjaVar2.b(indexOf2, null, strArr);
                            view = fjaVar2;
                            break;
                        default:
                            view = new mhb(context);
                            break;
                    }
                } else {
                    view = new uib(context);
                }
                return new y29(view);
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) dVar;
                switch (i) {
                    case 0:
                        vl7Var = new ld5(context);
                        break;
                    case 1:
                        vl7Var = new ahb(context);
                        break;
                    case 2:
                        vl7Var = new v6c(context, 6, 0, false);
                        break;
                    case 3:
                        vl7Var = new chb(context, null);
                        break;
                    case 4:
                        vl7Var = new mhb(context);
                        break;
                    case 5:
                        vl7Var = new uib(context);
                        break;
                    case 6:
                        wjbVar = ((d) notificationsCustomSettingsActivity).resourceProvider;
                        vl7Var = new vl7(this.e, 21, 64, true, wjbVar);
                        break;
                    case 7:
                    default:
                        vl7Var = new wgb(context);
                        break;
                    case 8:
                        pm7 pm7Var = new pm7(context);
                        ImageView imageView = new ImageView(context);
                        pm7Var.a0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        zkb.s(imageView, bkb.u6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(R.drawable.msg_expand);
                        pm7Var.addView(imageView, nme.d(24, 24.0f, (k96.a0 ? 3 : 5) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                        vl7Var = pm7Var;
                        break;
                }
                return new y29(vl7Var);
        }
    }

    @Override // w39
    public final void y(s49 s49Var) {
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
                    int b = s49Var.b();
                    View view = s49Var.a;
                    qm7 qm7Var = (b < 0 || b >= arrayList3.size()) ? null : (qm7) arrayList3.get(b);
                    if (qm7Var == null || qm7Var.c != 102) {
                        int i2 = s49Var.f;
                        if (i2 == 0) {
                            ((ld5) view).a(null, v);
                            break;
                        } else if (i2 == 1) {
                            ((ahb) view).e(null, v);
                            break;
                        } else if (i2 == 3) {
                            ((chb) view).a(null, v);
                            break;
                        } else if (i2 == 5) {
                            ((uib) view).a(null, v);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
