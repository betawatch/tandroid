// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ox0 extends c79 {
    public final /* synthetic */ byte c;
    public final Object d;

    public ox0(Context context) {
        this.c = (byte) 7;
        this.d = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        switch (this.c) {
            case 0:
            case 1:
            case 2:
                return false;
            case 3:
            case 4:
                return true;
            case 5:
                int i = f89Var.f;
                return i == 0 || i == 2;
            case 6:
                return f89Var.f == 1;
            case 7:
                int b = f89Var.b();
                return b == 1 || b == 2 || b == 3 || b == 4 || b == 7;
            case 8:
                int i2 = f89Var.f;
                return i2 == 1 || i2 == 2;
            case 9:
                return true;
            case 10:
                return false;
            case 11:
            default:
                return true;
        }
    }

    public final r47 E(int i) {
        aw9 aw9Var = (aw9) this.d;
        int i2 = aw9Var.w;
        if (i >= i2 && i < aw9Var.x) {
            return (r47) aw9Var.e.get(i - i2);
        }
        int i3 = aw9Var.E;
        if (i < i3 || i >= aw9Var.F) {
            return null;
        }
        return (r47) aw9Var.f.get(i - i3);
    }

    public final void H(int i, int i2) {
        int[] iArr = ((wua) this.d).N2;
        if (iArr[0] == i && iArr[1] == i2) {
            return;
        }
        iArr[0] = i;
        iArr[1] = i2;
        f();
    }

    @Override // j79
    public final int b() {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return 1;
            case 1:
                return !((df3) obj).b2.h() ? 3 : 1;
            case 2:
                return ((m94) obj).d.size();
            case 3:
                return ((rh4) obj).f3.size();
            case 4:
                return ((a67) obj).c.size();
            case 5:
                return ((aq7) obj).h;
            case 6:
                return ((kl8) obj).a2;
            case 7:
                return 6;
            case 8:
                return ((aw9) obj).r;
            case 9:
                return ((ow9) obj).r.size();
            case 10:
                return ((wua) obj).N2.length;
            case 11:
                return ((n0c) obj).U.size();
            default:
                return 12;
        }
    }

    @Override // j79
    public final long c(int i) {
        yp7 yp7Var;
        switch (this.c) {
            case 5:
                aq7 aq7Var = (aq7) this.d;
                int i2 = aq7Var.E;
                if (i < i2 || i >= aq7Var.F) {
                    int i3 = aq7Var.n;
                    yp7Var = (i < i3 || i >= aq7Var.r) ? null : (yp7) aq7Var.a.get(i - i3);
                } else {
                    yp7Var = (yp7) aq7Var.b.get(i - i2);
                }
                if (yp7Var != null) {
                    return yp7Var.c;
                }
                if (i == 0) {
                    return 1L;
                }
                if (i == aq7Var.y) {
                    return 2L;
                }
                if (i == aq7Var.s) {
                    return 3L;
                }
                if (i == aq7Var.w) {
                    return 4L;
                }
                if (i == aq7Var.x) {
                    return 5L;
                }
                throw new RuntimeException();
            default:
                return super.c(i);
        }
    }

    @Override // j79
    public final int d(int i) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
            case 1:
                return i;
            case 2:
                return ((k94) ((m94) obj).d.get(i)).a;
            case 3:
            case 4:
            default:
                return super.d(i);
            case 5:
                aq7 aq7Var = (aq7) obj;
                if (i < aq7Var.E || i >= aq7Var.F) {
                    if (i == 0 || i == aq7Var.y) {
                        return 1;
                    }
                    if (i == aq7Var.s) {
                        return 2;
                    }
                    if (i == aq7Var.w || i == aq7Var.x) {
                        return 3;
                    }
                }
                return 0;
            case 6:
                kl8 kl8Var = (kl8) obj;
                if (i != kl8Var.b2) {
                    if (i >= kl8Var.c2 && i < kl8Var.d2) {
                        return kl8Var.b1();
                    }
                    if (i >= kl8Var.e2 && i < kl8Var.f2) {
                        return 1;
                    }
                    if (i == kl8Var.g2) {
                        return 2;
                    }
                    if (i == kl8Var.h2) {
                        return 3;
                    }
                    if (i == 0) {
                        return 4;
                    }
                    if (i == kl8Var.i2) {
                        return 5;
                    }
                }
                return 0;
            case 7:
                if (i == 0 || i == 6) {
                    return 0;
                }
                if (i == 7) {
                    return 1;
                }
                return (i == 5 || i == 8) ? 3 : 2;
            case 8:
                aw9 aw9Var = (aw9) obj;
                if (i == aw9Var.s || i == aw9Var.y) {
                    return 0;
                }
                r47 E = E(i);
                return (E == null || !E.I3()) ? 1 : 2;
        }
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        boolean z;
        mw9 mw9Var;
        yp7 yp7Var = null;
        switch (this.c) {
            case 0:
            case 1:
                break;
            case 2:
                m94 m94Var = (m94) this.d;
                ArrayList arrayList = m94Var.d;
                if (((k94) arrayList.get(i)).a == 1) {
                    l94 l94Var = (l94) f89Var.a;
                    l94Var.c.setColorFilter(new PorterDuffColorFilter(m94Var.e.getPixel(i, 0), PorterDuff.Mode.MULTIPLY));
                    l94Var.c.setImageDrawable(m94Var.getContext().getDrawable(((k94) arrayList.get(i)).b));
                    l94Var.a.setText(((k94) arrayList.get(i)).c);
                    l94Var.b.setText(((k94) arrayList.get(i)).d);
                    break;
                }
                break;
            case 3:
                ((qh4) f89Var).v.setData((ph4) ((rh4) this.d).f3.get(i));
                break;
            case 4:
                z57 z57Var = (z57) f89Var.a;
                a67 a67Var = (a67) this.d;
                z57Var.a((TLObject) a67Var.c.get(i), ((Integer) a67Var.b.get(i)).intValue(), false);
                break;
            case 5:
                aq7 aq7Var = (aq7) this.d;
                vnb vnbVar = aq7Var.f;
                int i2 = f89Var.f;
                View view = f89Var.a;
                if (i2 == 0) {
                    zp7 zp7Var = (zp7) view;
                    int i3 = aq7Var.E;
                    if (i >= i3 && i < aq7Var.F) {
                        yp7Var = (yp7) aq7Var.b.get(i - i3);
                    }
                    int i4 = aq7Var.n;
                    if (i >= i4 && i < aq7Var.r) {
                        yp7Var = (yp7) aq7Var.a.get(i - i4);
                    }
                    if (yp7Var != null) {
                        boolean z2 = zp7Var.e == yp7Var;
                        boolean z3 = yp7Var == aq7Var.H;
                        boolean z4 = aq7Var.J.get(yp7Var.c) != null;
                        zp7Var.e = yp7Var;
                        zp7Var.a.setText(yp7Var.f);
                        zp7Var.d = i != aq7Var.F - 1;
                        zp7Var.b.a(z3, z2);
                        zp7Var.c.a(z4, z2);
                        break;
                    }
                } else if (i2 == 1) {
                    mf5 mf5Var = (mf5) view;
                    if (i != 0) {
                        if (i == aq7Var.y) {
                            mf5Var.setText(ob6.M0(2131743942, null));
                            break;
                        }
                    } else {
                        mf5Var.setText(ob6.M0(2131743864, null));
                        break;
                    }
                } else if (i2 == 2) {
                    f23 f23Var = (f23) view;
                    Drawable drawable = f23Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable2 = f23Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
                    int i5 = aob.N6;
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    yob.x(f23Var, drawable, i5, vnbVar, mode);
                    yob.x(f23Var, drawable2, aob.k7, vnbVar, mode);
                    zm2 zm2Var = new zm2(drawable, drawable2);
                    f23Var.a.l(ob6.M0(2131743458, null), false);
                    f23Var.b.setImageDrawable(zm2Var);
                    f23Var.c = false;
                    break;
                }
                break;
            case 6:
                View view2 = f89Var.a;
                kl8 kl8Var = (kl8) this.d;
                int i6 = kl8Var.e2;
                if (i >= i6 && i < kl8Var.f2) {
                    ((yk8) view2).a((sl8) kl8Var.S1.get(i - i6), i != kl8Var.f2 - 1);
                    break;
                } else if (i >= kl8Var.c2 && i < kl8Var.d2) {
                    kl8Var.c1(view2);
                    break;
                }
                break;
            case 7:
                int i7 = f89Var.f;
                if (i7 != 0) {
                    View view3 = f89Var.a;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            ((ilb) view3).setText(i == 5 ? ob6.M0(2131745714, null) : ob6.M0(2131745717, null));
                            break;
                        } else {
                            qmb qmbVar = (qmb) view3;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        qmbVar.c(ob6.M0(2131745724, null), kp9.a0(phd.g.a()), false, false);
                                        break;
                                    } else {
                                        qmbVar.c(ob6.M0(2131745716, null), uh9.l(new StringBuilder(), ((ep9) phd.f.a()).a, " FPS"), false, true);
                                        break;
                                    }
                                } else {
                                    String M0 = ob6.M0(2131745723, null);
                                    dp9 dp9Var = (dp9) phd.e.a();
                                    qmbVar.c(M0, dp9Var == dp9.a ? ob6.M0(2131745722, null) : dp9Var == dp9.b ? ob6.M0(2131745720, null) : ob6.M0(2131745721, null), false, true);
                                    break;
                                }
                            } else {
                                qmbVar.c(ob6.M0(2131745713, null), uh9.l(new StringBuilder(), ((hp9) phd.d.a()).a, "p"), false, true);
                                break;
                            }
                        }
                    } else {
                        String M02 = ob6.M0(2131745718, null);
                        im0 im0Var = phd.h;
                        im0Var.a();
                        ((wkb) view3).f(M02, im0Var.d, false);
                        break;
                    }
                } else {
                    ((mf5) f89Var.a).setText(i == 0 ? ob6.M0(2131745715, null) : ob6.M0(2131745719, null));
                    break;
                }
            case 8:
                aw9 aw9Var = (aw9) this.d;
                qg4 qg4Var = aw9Var.K;
                int i8 = f89Var.f;
                View view4 = f89Var.a;
                if (i8 != 0) {
                    r47 E = E(i);
                    if (E != null) {
                        boolean z5 = aw9Var.J.u() && i >= aw9Var.w && i < aw9Var.x;
                        if (i8 != 1) {
                            if (i8 == 2) {
                                vea veaVar = (vea) view4;
                                int e1 = veaVar.getMessage() == null ? 0 : veaVar.getMessage().e1();
                                veaVar.f(E, true);
                                int e12 = veaVar.getMessage().e1();
                                qg4Var.a = r47.B0(veaVar.getMessage().k);
                                qg4Var.b = e12;
                                veaVar.e(aw9Var.J.d(qg4Var), e1 == E.e1());
                                z = e1 == E.e1();
                                if (veaVar.e0 != z5) {
                                    veaVar.e0 = z5;
                                    if (!z) {
                                        veaVar.f0 = z5 ? 1.0f : 0.0f;
                                    }
                                    veaVar.invalidate();
                                    break;
                                }
                            }
                        } else {
                            xv9 xv9Var = (xv9) view4;
                            yob.h(aob.d6, null, xv9Var);
                            zea zeaVar = xv9Var.a;
                            int e13 = zeaVar.getMessage() == null ? 0 : zeaVar.getMessage().e1();
                            zeaVar.c(E, true);
                            int e14 = zeaVar.getMessage().e1();
                            qg4Var.a = r47.B0(zeaVar.getMessage().k);
                            qg4Var.b = e14;
                            zeaVar.b(aw9Var.J.d(qg4Var), e13 == E.e1());
                            z = e13 == E.e1();
                            if (zeaVar.P != z5) {
                                zeaVar.P = z5;
                                if (!z) {
                                    zeaVar.Q = z5 ? 1.0f : 0.0f;
                                }
                                zeaVar.invalidate();
                                break;
                            }
                        }
                    }
                } else {
                    p55 p55Var = (p55) view4;
                    if (i != aw9Var.s) {
                        if (i == aw9Var.y) {
                            p55Var.b(ob6.M0(2131746089, null), ob6.M0(2131745223, null), new jn8(this, (byte) 17));
                            break;
                        }
                    } else {
                        String M03 = ob6.M0(2131751309, null);
                        boolean equals = p55Var.getText().equals(M03);
                        boolean z6 = aw9Var.I;
                        if (!equals) {
                            p55Var.b(M03, z6 ? ob6.M0(2131747160, null) : ob6.M0(2131745780, null), new zv9(this));
                            break;
                        } else {
                            String M04 = z6 ? ob6.M0(2131747160, null) : ob6.M0(2131745780, null);
                            boolean z7 = aw9Var.I;
                            si siVar = p55Var.b;
                            siVar.c(M04, true, z7);
                            siVar.setVisibility(0);
                            break;
                        }
                    }
                }
                break;
            case 9:
                View view5 = f89Var.a;
                ow9 ow9Var = (ow9) this.d;
                ArrayList arrayList2 = ow9Var.r;
                if (i >= 0 && i < arrayList2.size()) {
                    lw9 lw9Var = (lw9) arrayList2.get(i);
                    nw9 nw9Var = (nw9) view5;
                    w49 w49Var = nw9Var.d;
                    boolean z8 = w49Var == null || !w49Var.equals(lw9Var.a);
                    if (z8) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = lw9Var.a.g();
                        tL_reactionCount.count = lw9Var.b;
                        ow9 ow9Var2 = nw9Var.s;
                        mw9 mw9Var2 = new mw9(nw9Var, ow9Var2.a, nw9Var, tL_reactionCount, ow9Var2.c);
                        nw9Var.a = mw9Var2;
                        mw9Var2.E.d(hl.L(29.0f), hl.L(100.0f));
                        mw9Var = nw9Var.a;
                        mw9Var.p = true;
                        mw9Var.R = true;
                    } else {
                        mw9Var = nw9Var.a;
                        mw9Var.v = lw9Var.b;
                    }
                    nw9Var.d = lw9Var.a;
                    if (!z8) {
                        mw9Var.e = mw9Var.z;
                    }
                    mw9Var.z = hl.L(44.33f);
                    nw9Var.a.t = !TextUtils.isEmpty(lw9Var.c);
                    mw9 mw9Var3 = nw9Var.a;
                    boolean z9 = mw9Var3.t;
                    hn hnVar = mw9Var3.F;
                    if (z9) {
                        hnVar.t(pv3.m(lw9Var.c, hnVar.a.getFontMetricsInt(), false, null, 0), !z8, true);
                    } else if (hnVar != null) {
                        hnVar.t("", !z8, true);
                    }
                    nw9Var.a.getClass();
                    nw9Var.a.E.c(lw9Var.b, !z8);
                    mw9 mw9Var4 = nw9Var.a;
                    if (mw9Var4.E != null && (mw9Var4.v > 0 || mw9Var4.t)) {
                        float f = mw9Var4.z;
                        float L = hl.L(nw9Var.a.t ? 4.0f : 0.0f) + ((int) Math.ceil(r6.m));
                        mw9 mw9Var5 = nw9Var.a;
                        mw9Var4.z = (int) (L + mw9Var5.F.d + f);
                        mw9Var4 = mw9Var5;
                    }
                    if (z8) {
                        mw9Var4.e = mw9Var4.z;
                    }
                    mw9Var4.A = hl.L(28.0f);
                    mw9 mw9Var6 = nw9Var.a;
                    mw9Var6.o = nw9Var.e;
                    if (nw9Var.r) {
                        mw9Var6.a();
                    }
                    if (!z8) {
                        nw9Var.requestLayout();
                    }
                    ((nw9) view5).a(lw9Var.a.h == ow9Var.h, false);
                    break;
                }
                break;
            case 10:
                int[] iArr = ((wua) this.d).N2;
                int length = (iArr.length - 1) - i;
                px0 px0Var = (px0) f89Var.a;
                int i9 = iArr[length];
                if (px0Var.a != i9) {
                    px0Var.a = i9;
                    px0Var.requestLayout();
                    break;
                }
                break;
            case 11:
                l0c l0cVar = (l0c) f89Var.a;
                k0c k0cVar = (k0c) ((n0c) this.d).U.get(i);
                n0c n0cVar = l0cVar.s;
                de0 de0Var = l0cVar.a;
                k0c k0cVar2 = l0cVar.e;
                z = k0cVar2 != null && k0cVar2.a == k0cVar.a && Objects.equals(k0cVar2.b, k0cVar.b);
                if (n0cVar.a0 >= 1.0f && n0cVar.k0 == null) {
                    l0cVar.setScaleX(1.0f);
                    l0cVar.setScaleY(1.0f);
                    l0cVar.setAlpha(1.0f);
                }
                l0cVar.e = k0cVar;
                if (!z) {
                    de0Var.setAnimatedEmojiDrawable(null);
                    l0cVar.h = null;
                    l0cVar.n = 0;
                    if (k0cVar.a != 0) {
                        l0cVar.f = null;
                        de0Var.setVisibility(0);
                        wl wlVar = new wl(3, n0cVar.a, k0cVar.a);
                        l0cVar.h = wlVar;
                        de0Var.setAnimatedEmojiDrawable(wlVar);
                    } else {
                        l0cVar.f = ob6.M0(k0cVar.b.booleanValue() ? 2131743646 : 2131743645, null);
                        de0Var.setVisibility(8);
                    }
                    l0cVar.setContentDescription(l0cVar.f);
                }
                l0cVar.a(z);
                l0cVar.requestLayout();
                l0cVar.invalidate();
                break;
            default:
                ((xvc) f89Var.a).a = WallpapersListActivity.j0[i];
                break;
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        View view3;
        View view4;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        byte b = this.c;
        byte b2 = 3;
        final byte b3 = 1;
        final byte b4 = 0;
        Object obj = this.d;
        switch (b) {
            case 0:
                return new n69(((qx0) obj).S1);
            case 1:
                df3 df3Var = (df3) obj;
                if (i == 0) {
                    view = df3Var.Y1;
                } else if (i == 2) {
                    View view5 = df3Var.Z1;
                    r79 r79Var = new r79(-1, -2);
                    int i2 = df3Var.u0;
                    ((ViewGroup.MarginLayoutParams) r79Var).leftMargin = i2;
                    ((ViewGroup.MarginLayoutParams) r79Var).rightMargin = i2;
                    view5.setLayoutParams(r79Var);
                    view = view5;
                } else {
                    ilb ilbVar = new ilb(viewGroup.getContext());
                    ilbVar.setFixedSize(12);
                    int i3 = aob.a7;
                    ColorDrawable colorDrawable = new ColorDrawable(aob.w0(null, i3, false));
                    yob.x(ilbVar, colorDrawable, i3, null, PorterDuff.Mode.SRC_IN);
                    zm2 zm2Var = new zm2(colorDrawable, aob.W0(viewGroup.getContext(), R.drawable.greydivider_bottom, aob.b7));
                    zm2Var.x = true;
                    ilbVar.setBackgroundDrawable(zm2Var);
                    view = ilbVar;
                }
                return new n69(view);
            case 2:
                m94 m94Var = (m94) obj;
                vnb vnbVar = m94Var.a;
                if (i == 0) {
                    view2 = new j94(m94Var, m94Var.getContext());
                } else if (i == 2) {
                    view2 = new ak4(m94Var.getContext(), 16, (byte) 0);
                } else {
                    Context context = m94Var.getContext();
                    l94 l94Var = new l94(context);
                    ImageView imageView = new ImageView(context);
                    l94Var.c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    l94Var.addView(imageView, tre.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    l94Var.a = textView;
                    textView.setTypeface(hl.o());
                    yob.X(textView, aob.G6, vnbVar);
                    textView.setTextSize(1, 14.0f);
                    l94Var.addView(textView, tre.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    l94Var.b = textView2;
                    yob.X(textView2, aob.y6, vnbVar);
                    textView2.setTextSize(1, 14.0f);
                    l94Var.addView(textView2, tre.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view2 = l94Var;
                }
                return qu6.h(view2, view2, -1, -2);
            case 3:
                oh4 oh4Var = new oh4(viewGroup.getContext(), ((rh4) obj).o2);
                qh4 qh4Var = new qh4(oh4Var);
                qh4Var.v = oh4Var;
                oh4Var.setLayoutParams(new r79(-2, hl.L(30.0f)));
                return qh4Var;
            case 4:
                z57 z57Var = new z57(viewGroup.getContext());
                z57Var.setLayoutParams(new r79(-1, hl.L(50.0f)));
                return new n69(z57Var);
            case 5:
                vnb vnbVar2 = ((aq7) obj).f;
                Context context2 = viewGroup.getContext();
                if (i == 0) {
                    zp7 zp7Var = new zp7(context2);
                    RadioButton radioButton = new RadioButton(context2);
                    zp7Var.b = radioButton;
                    radioButton.setSize(hl.L(20.0f));
                    yob.O(radioButton, aob.g7, aob.h7, vnbVar2);
                    boolean z = ob6.a0;
                    zp7Var.addView(radioButton, tre.d(22, 22.0f, (z ? 5 : 3) | 16, z ? 0 : 20, 0.0f, z ? (byte) 20 : (byte) 0, 0.0f));
                    og2 og2Var = new og2(24, vnbVar2, context2);
                    zp7Var.c = og2Var;
                    int i4 = aob.d6;
                    og2Var.b(-1, i4, aob.k7);
                    og2Var.setDrawUnchecked(false);
                    og2Var.setDrawBackgroundAsArc(3);
                    boolean z2 = ob6.a0;
                    zp7Var.addView(og2Var, tre.d(26, 26.0f, (z2 ? 5 : 3) | 16, z2 ? 0 : 18, 0.0f, z2 ? 18 : 0, 0.0f));
                    og2Var.a(true, false);
                    TextView textView3 = new TextView(context2);
                    zp7Var.a = textView3;
                    yob.X(textView3, aob.G6, vnbVar2);
                    ik8.w(textView3, 1, 16.0f, 1, 1);
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity((ob6.a0 ? 5 : 3) | 16);
                    boolean z3 = ob6.a0;
                    zp7Var.addView(textView3, tre.d(-2, -2.0f, (z3 ? 5 : 3) | 16, z3 ? 23 : 61, 0.0f, z3 ? 61 : 23, 0.0f));
                    yob.h(i4, vnbVar2, zp7Var);
                    view3 = zp7Var;
                } else if (i == 2) {
                    f23 f23Var = new f23(70, vnbVar2, context2);
                    f23Var.d = (byte) 61;
                    yob.h(aob.d6, vnbVar2, f23Var);
                    view3 = f23Var;
                } else if (i != 3) {
                    mf5 mf5Var = new mf5(context2, vnbVar2);
                    yob.h(aob.d6, vnbVar2, mf5Var);
                    view3 = mf5Var;
                } else {
                    view3 = new rca(context2, (uh9) null);
                }
                return qu6.h(view3, view3, -1, -2);
            case 6:
                Context context3 = viewGroup.getContext();
                kl8 kl8Var = (kl8) obj;
                View d1 = kl8Var.d1(context3, i);
                if (d1 != null) {
                    return qu6.h(d1, d1, -1, -2);
                }
                if (i == 0) {
                    oob oobVar = new oob((byte) 10, context3, this);
                    kl8Var.n2 = oobVar;
                    oobVar.setOrientation(1);
                    View view6 = kl8Var.w2;
                    if (view6 == null) {
                        kl8Var.m2 = new i94(context3, b3, b4, b2);
                        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        int i5 = aob.Dk;
                        canvas.drawColor(vm2.f(0.5f, aob.v0(i5, kl8Var.J0), aob.v0(aob.h5, kl8Var.J0)));
                        kl8Var.m2.setBackgroundBitmap(createBitmap);
                        ys4 ys4Var = kl8Var.m2.b;
                        ys4Var.z = i5;
                        ys4Var.A = aob.Ck;
                        ys4Var.b();
                        oobVar.addView(kl8Var.m2, tre.r(jn7.p2, jn7.p2, 1));
                    } else {
                        if (view6.getParent() != null) {
                            ((ViewGroup) kl8Var.w2.getParent()).removeView(kl8Var.w2);
                        }
                        kl8Var.a1(oobVar);
                    }
                    if (kl8Var.I2 == null) {
                        FrameLayout frameLayout3 = new FrameLayout(context3);
                        kl8Var.I2 = frameLayout3;
                        frameLayout3.setClipChildren(false);
                        Integer num = kl8Var.p2;
                        new PorterDuffColorFilter(num == null ? aob.v0(aob.v6, kl8Var.J0) : num.intValue(), PorterDuff.Mode.SRC_IN);
                        kl8Var.J2 = new p66[2];
                        int i6 = 0;
                        while (i6 < 2) {
                            kl8Var.J2[i6] = new b21(context3, kl8Var.J0, (byte) 6);
                            kl8Var.J2[i6].setVisibility(i6 == 0 ? 0 : 8);
                            kl8Var.J2[i6].setTextSize(1, 16.0f);
                            kl8Var.J2[i6].setTypeface(hl.o());
                            kl8Var.J2[i6].setGravity(1);
                            yob.X(kl8Var.J2[i6], aob.G6, kl8Var.J0);
                            yob.G(kl8Var.J2[i6], aob.J6, kl8Var.J0);
                            kl8Var.I2.addView(kl8Var.J2[i6], tre.c(-2.0f, -1));
                            i6++;
                        }
                    }
                    if (kl8Var.I2.getParent() != null) {
                        ((ViewGroup) kl8Var.I2.getParent()).removeView(kl8Var.I2);
                    }
                    oobVar.addView(kl8Var.I2, tre.q(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                    if (kl8Var.K2 == null) {
                        p66 p66Var = new p66(kl8Var.getContext(), kl8Var.J0);
                        kl8Var.K2 = p66Var;
                        p66Var.setTextSize(1, 14.0f);
                        kl8Var.K2.setGravity(1);
                        yob.X(kl8Var.K2, aob.G6, kl8Var.J0);
                        yob.G(kl8Var.K2, aob.J6, kl8Var.J0);
                    }
                    if (kl8Var.K2.getParent() != null) {
                        ((ViewGroup) kl8Var.K2.getParent()).removeView(kl8Var.K2);
                    }
                    oobVar.addView(kl8Var.K2, tre.q(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                    kl8Var.f1(false);
                    kl8Var.l2 = new vb(context3, (byte) 5);
                    d26 d26Var = new d26((byte) 14, context3, this);
                    d26Var.setClipChildren(false);
                    d26Var.addView(kl8Var.l2);
                    d26Var.addView(oobVar);
                    i94 i94Var = kl8Var.m2;
                    view4 = d26Var;
                    if (i94Var != null) {
                        i94Var.setStarParticlesView(kl8Var.l2);
                        view4 = d26Var;
                    }
                } else if (i == 2) {
                    int i7 = aob.a7;
                    rca rcaVar = new rca(context3, aob.v0(i7, kl8Var.J0), 0);
                    yob.h(i7, kl8Var.J0, rcaVar);
                    view4 = rcaVar;
                } else if (i == 3) {
                    view4 = new t62(context3, r6);
                } else if (i == 4) {
                    view4 = new u1(context3, (byte) 0);
                } else if (i != 5) {
                    view4 = new jl8(this, context3, kl8Var.J0);
                } else {
                    hlb hlbVar = new hlb(context3, kl8Var.J0);
                    hlbVar.setBackground(true);
                    String M0 = ob6.M0(2131749451, "GiftPremiumPrivacyPolicyAndTerms");
                    int i8 = aob.Xc;
                    hlbVar.setText(hl.G2(hl.N2(M0, i8, 0, new Runnable(this) { // from class: il8
                        public final /* synthetic */ ox0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b5 = b4;
                            ox0 ox0Var = this.b;
                            switch (b5) {
                                case 0:
                                    m01.u(((kl8) ox0Var.d).o2.getParentActivity(), ob6.M0(2131743849, null));
                                    break;
                                default:
                                    m01.u(((kl8) ox0Var.d).o2.getParentActivity(), ob6.M0(2131746510, null));
                                    break;
                            }
                        }
                    }, null), hl.N2(ob6.M0(2131749452, "GiftPremiumPrivacyPolicy"), i8, 0, new Runnable(this) { // from class: il8
                        public final /* synthetic */ ox0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b5 = b3;
                            ox0 ox0Var = this.b;
                            switch (b5) {
                                case 0:
                                    m01.u(((kl8) ox0Var.d).o2.getParentActivity(), ob6.M0(2131743849, null));
                                    break;
                                default:
                                    m01.u(((kl8) ox0Var.d).o2.getParentActivity(), ob6.M0(2131746510, null));
                                    break;
                            }
                        }
                    }, null), "%1$s"));
                    view4 = hlbVar;
                }
                view4.setLayoutParams(new r79(-1, -2));
                kl8Var.Z0(i, view4);
                return new n69(view4);
            case 7:
                Context context4 = (Context) obj;
                if (i == 0) {
                    frameLayout = new mf5(context4);
                } else if (i == 1) {
                    frameLayout = new wkb(context4);
                } else if (i == 2) {
                    qmb qmbVar = new qmb(context4);
                    qmbVar.setCanDisable(true);
                    frameLayout = qmbVar;
                } else {
                    frameLayout = new ilb(context4);
                }
                frameLayout.setLayoutParams(new r79(-1, -2));
                return new n69(frameLayout);
            case 8:
                if (i == 0) {
                    frameLayout2 = new p55(viewGroup.getContext(), null);
                } else if (i == 1) {
                    Context context5 = viewGroup.getContext();
                    xv9 xv9Var = new xv9(context5);
                    zea zeaVar = new zea(2, null, context5);
                    xv9Var.a = zeaVar;
                    zeaVar.r.setVisibility(8);
                    xv9Var.addView(zeaVar);
                    frameLayout2 = xv9Var;
                } else {
                    frameLayout2 = new yv9(viewGroup.getContext());
                }
                frameLayout2.setLayoutParams(new r79(-1, -2));
                return new n69(frameLayout2);
            case 9:
                ow9 ow9Var = (ow9) obj;
                return new n69(new nw9(ow9Var, ow9Var.getContext()));
            case 10:
                px0 px0Var = new px0(((wua) obj).getContext());
                px0Var.a = 0;
                return new n69(px0Var);
            case 11:
                l0c l0cVar = new l0c((n0c) obj, viewGroup.getContext());
                l0cVar.setLayoutParams(new r79(-2, -1));
                return new n69(l0cVar);
            default:
                cwc cwcVar = (cwc) obj;
                return new n69(new xvc(cwcVar.F, cwcVar.c));
        }
    }

    @Override // j79
    public final void y(f89 f89Var) {
        switch (this.c) {
            case 9:
                ow9 ow9Var = (ow9) this.d;
                ArrayList arrayList = ow9Var.r;
                int b = f89Var.b();
                if (b >= 0 && b < arrayList.size()) {
                    ((nw9) f89Var.a).a(((lw9) arrayList.get(b)).a.h == ow9Var.h, false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ox0(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    private final void F(f89 f89Var, int i) {
    }

    private final void G(f89 f89Var, int i) {
    }
}
