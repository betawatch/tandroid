package ph;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.r5;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.vp;
import org.telegram.messenger.x20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.yv0;
import rh.e6;
import th.o7;
import vh.f5;
import vh.k4;
import vh.k7;
import vh.m5;
import vh.n5;
import vh.o8;
import vh.s7;
import vh.t5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h1 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        String str;
        String str2;
        int i10;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        switch (this.a) {
            case 0:
                ((i1) this.b).a();
                break;
            case 1:
                ((r3) this.b).i0(((Boolean) obj).booleanValue());
                break;
            case 2:
                p3 p3Var = (p3) this.b;
                ((Boolean) obj).getClass();
                l3 l3Var = p3Var.d;
                if (l3Var != null) {
                    l3Var.run();
                    break;
                }
                break;
            case 3:
                mg.p.j(((g4) this.b).getContext(), (TLRPC.TL_error) obj);
                break;
            case 4:
                qh.r rVar = (qh.r) this.b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (rVar.D == null) {
                    if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents == null) {
                        rVar.F = true;
                    } else {
                        rVar.D = tL_messages_stickerSet;
                    }
                    rVar.e();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.b;
                Long l4 = (Long) obj;
                if (!k2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        k2Var.presentFragment(ProfileActivity.z4(l4.longValue()), true);
                        break;
                    } else {
                        org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.m0(29));
                        break;
                    }
                }
                break;
            case 6:
                qh.m0 m0Var = (qh.m0) this.b;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                qh.x0 x0Var = m0Var.b;
                if (!m0Var.E && tL_exportedContactToken != null) {
                    m0Var.r = tL_exportedContactToken;
                    m0Var.s = 0L;
                    String str3 = tL_exportedContactToken.url;
                    String str4 = m0Var.c.b;
                    if (!TextUtils.equals(x0Var.f, str4) || x0Var.h) {
                        x0Var.f = str4;
                        x0Var.h = false;
                        x0Var.H5 = null;
                        x0Var.I5 = 0;
                    }
                    if (!TextUtils.equals(x0Var.d, str3)) {
                        x0Var.d = str3;
                        Utilities.e.c(new org.telegram.utils.twidget.h0(str3, new qh.o0(x0Var, str3, 0)));
                    }
                    x0Var.setLinkExpires(tL_exportedContactToken.expires);
                    break;
                }
                break;
            case 7:
                qh.x0 x0Var2 = (qh.x0) this.b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet2 != null) {
                    x0Var2.getClass();
                    ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet2.documents;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        x0Var2.p8 = tL_messages_stickerSet2.documents.get(0);
                    }
                }
                x0Var2.invalidate();
                break;
            case 8:
                rh.b0 b0Var = (rh.b0) this.b;
                int i14 = rh.b0.p2[((Integer) obj).intValue()];
                if (b0Var.g2 != i14) {
                    b0Var.g2 = i14;
                    b0Var.Y1.setText(cd.G(i14 / 3600, "GiftOfferHours", new Object[0]));
                }
                b0Var.e1(true);
                break;
            case 9:
                rh.t0 t0Var = (rh.t0) this.b;
                t0Var.a2.g();
                t0Var.c2.O(true);
                break;
            case 10:
                rh.n2 n2Var = (rh.n2) this.b;
                n2Var.getClass();
                n2Var.s = new Matrix();
                n2Var.w = new Matrix();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode, tileMode);
                n2Var.r = bitmapShader;
                Paint paint = n2Var.c;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.i0.i(colorMatrix, 0.25f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 11:
                e6.a((e6) this.b, (TL_stars.StarGifts) obj);
                break;
            case 12:
                ((org.telegram.ui.ActionBar.z2) this.b).a(((Boolean) obj).booleanValue());
                break;
            case 13:
                TextView textView = (TextView) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                        int i15 = starGift.availability_remains;
                        textView.setText(i15 <= 0 ? cd.H(',', "Gift2Availability2ValueNone", starGift.availability_total) : cd.K("Gift2Availability4Value", i15, ',', cd.E(starGift.availability_total, ',')));
                        break;
                    } else {
                        if (starGift.availability_remains <= 0) {
                            str = cd.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
                        } else {
                            str = cd.H(',', "Gift2QuantityIssued1", starGift.availability_issued) + cd.H(',', "Gift2QuantityIssued2", starGift.availability_total);
                        }
                        textView.setText(str);
                        break;
                    }
                }
                break;
            case 14:
                th.s0 s0Var = (th.s0) this.b;
                if (((Boolean) obj).booleanValue() && !s0Var.x) {
                    s0Var.n = true;
                    s0Var.I = true;
                    s0Var.u(false);
                    th.s0.W = s0Var;
                    s0Var.J = NativeInstance.createVideoCapturer(s0Var.H, s0Var.I ? 1 : 0);
                    if (s0Var.E != null) {
                        r5 r5Var = Utilities.e;
                        NativeInstance nativeInstance = s0Var.E;
                        Objects.requireNonNull(nativeInstance);
                        r5Var.c(new org.telegram.messenger.voip.v0(nativeInstance, 3));
                        s0Var.M.clear();
                        s0Var.E = null;
                    }
                    s0Var.c();
                    s0Var.k();
                    zs.f(s0Var.e).k(zs.G2, Long.valueOf(s0Var.f.id));
                    break;
                }
                break;
            case 15:
                o7 o7Var = (o7) this.b;
                o7Var.k1 = false;
                o7Var.d0();
                break;
            case 16:
                th.y3 y3Var = (th.y3) obj;
                th.f4 f4Var = ((th.c4) this.b).e;
                while (true) {
                    ArrayList arrayList2 = f4Var.G;
                    if (i11 >= arrayList2.size()) {
                        break;
                    } else {
                        if (y3Var != arrayList2.get(i11)) {
                            ((th.y3) arrayList2.get(i11)).getClass();
                        }
                        i11++;
                    }
                }
            case 17:
                th.e6 e6Var = (th.e6) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                e6Var.p = true;
                if (storyItem != null && (str2 = storyItem.caption) != null) {
                    e6Var.m = true;
                    e6Var.l = str2;
                    e6Var.f = TextUtils.isEmpty(str2);
                    View view = e6Var.r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = e6Var.s;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 18:
                uh.m mVar = (uh.m) this.b;
                String str5 = (String) obj;
                ArrayList arrayList3 = mVar.h;
                if (!arrayList3.contains(str5)) {
                    arrayList3.add(str5);
                    mVar.i(true);
                }
                org.telegram.messenger.i0.h3(new th.o0(27, mVar, str5), 120L);
                break;
            case 19:
                ((vh.k) this.b).x(((Integer) obj).intValue());
                break;
            case 20:
                vh.x xVar = (vh.x) this.b;
                xVar.j0.n.P = ((Float) obj).floatValue();
                vh.w wVar = xVar.j0;
                kg.j2 j2Var = wVar.d;
                if (j2Var != null) {
                    j2Var.setVolume(wVar.n.P);
                    break;
                }
                break;
            case 21:
                vh.k0 k0Var = (vh.k0) this.b;
                x20 x20Var = (x20) obj;
                jj jjVar = k0Var.c;
                if (jjVar != null) {
                    jjVar.p0 = x20Var;
                    MediaController.B().h0(k0Var.c, false, true, false);
                    break;
                }
                break;
            case 22:
                vh.z1 z1Var = (vh.z1) this.b;
                z1Var.h(-1.0f);
                org.telegram.messenger.i0.h3(new vh.d1(i13, z1Var, (Runnable) obj), 80L);
                break;
            case 23:
                ((vh.k2) this.b).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + org.telegram.messenger.i0.L(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.m1.w).start();
                break;
            case 24:
                vh.y2 y2Var = (vh.y2) this.b;
                View view2 = (View) obj;
                ii iiVar = y2Var.b;
                if (view2 instanceof vh.x2) {
                    iiVar.getClass();
                    int R = RecyclerView.R(view2);
                    a51 G = iiVar.f3.G(R);
                    if (G != null) {
                        vh.x2 x2Var = (vh.x2) view2;
                        x2Var.setPosition(y2Var.b(R));
                        x2Var.b(y2Var.f == G.d, true);
                        boolean contains = y2Var.e.contains(Integer.valueOf(G.d));
                        if (x2Var.h != contains) {
                            x2Var.h = contains;
                            x2Var.invalidate();
                        }
                        view2.setPressed(false);
                        break;
                    }
                }
                break;
            case 25:
                ii iiVar2 = (ii) this.b;
                View view3 = (View) obj;
                if (view3 instanceof vh.x2) {
                    k7 k7Var = (k7) iiVar2.n3;
                    k7Var.b.getClass();
                    ((vh.x2) view3).setPosition(k7Var.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    break;
                }
                break;
            case 26:
                s7 s7Var = (s7) ((vh.b4) this.b);
                o8 o8Var = s7Var.j2;
                o8Var.X0.p((jj) obj);
                n5 n5Var = o8Var.K1;
                if (n5Var != null && o8Var.O1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(n5Var.y);
                    boolean z10 = !isEmpty;
                    ((kf0) o8Var.j1.c).a(!o8Var.X0.k(), false);
                    o8Var.j1.setVisibility(0);
                    o8Var.j1.animate().alpha(!isEmpty ? 1.0f : 0.0f).withEndAction(new yv0(14, s7Var, z10)).start();
                }
                if (o8Var.A0.j()) {
                    ArrayList arrayList4 = o8Var.A0.h;
                    int size = arrayList4.size();
                    while (true) {
                        if (i12 < size) {
                            Object obj2 = arrayList4.get(i12);
                            i12++;
                            n5 n5Var2 = ((vh.w) obj2).n;
                            if (n5Var2 != null && n5Var2.K) {
                                i10 = TextUtils.isEmpty(o8Var.K1.y) ? -1 : 2;
                            }
                        }
                    }
                }
                o8Var.k0(i10, true, true);
                break;
            case 27:
                m5 m5Var = (m5) obj;
                k61 k61Var = ((k4) this.b).n;
                if (k61Var != null) {
                    k61Var.setHDRInfo(m5Var);
                    break;
                }
                break;
            case 28:
                f5 f5Var = (f5) this.b;
                Long l10 = (Long) obj;
                f5Var.w2 = false;
                TLRPC.User Z1 = l10 != null ? vp.r1(f5Var.a).Z1(l10) : null;
                f5Var.v2 = Z1;
                f5Var.x2 = Z1 == null;
                if (Z1 != null) {
                    f5Var.g1();
                    break;
                }
                break;
            default:
                t5 t5Var = (t5) this.b;
                jg.s0 s0Var2 = (jg.s0) obj;
                if (s0Var2 != null) {
                    t5Var.g2 = s0Var2.e;
                    t5Var.f2 = s0Var2.f;
                    break;
                } else {
                    t5Var.e1();
                    break;
                }
        }
    }
}
