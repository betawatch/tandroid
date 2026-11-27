// default package

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
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class sh9 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sh9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // pcc
    public final void a(Object obj) {
        String str;
        l9c l9cVar;
        byte b = this.a;
        TL_account.TL_birthday tL_birthday = null;
        int i = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                pi9 pi9Var = (pi9) obj2;
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    pi9Var.O1(pageblockmath);
                    break;
                }
                break;
            case 1:
                dq9 dq9Var = (dq9) obj2;
                if (((Boolean) obj).booleanValue() && !dq9Var.w) {
                    dq9Var.n = true;
                    dq9Var.R = true;
                    dq9Var.E(false);
                    w96.N = dq9Var;
                    dq9Var.S = NativeInstance.createVideoCapturer(dq9Var.Q, dq9Var.R ? 1 : 0);
                    dq9Var.M();
                    dq9Var.I();
                    dq9Var.n();
                    jn7.f(dq9Var.e).k(jn7.G2, Long.valueOf(dq9Var.f.id));
                    break;
                }
                break;
            case 2:
                icc iccVar = (icc) obj2;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                hl.i(colorMatrix, aob.I.o() ? 0.04f : 0.25f);
                hl.h(colorMatrix, aob.I.o() ? -0.04f : -0.07f);
                Bitmap l = hl.l(bitmap, colorMatrix);
                l.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(aob.I.o() ? 2.0f : 3.0f);
                if (!aob.I.o()) {
                    hl.h(colorMatrix2, aob.I.o() ? -0.2f : -0.07f);
                }
                Bitmap l2 = hl.l(bitmap, colorMatrix2);
                l2.setHasAlpha(false);
                bitmap.recycle();
                iccVar.a(l, l2);
                break;
            case 3:
                r1a r1aVar = (r1a) obj2;
                Long l3 = (Long) obj;
                r1aVar.y2 = false;
                TLRPC.User X1 = l3 != null ? uc7.s1(r1aVar.a).X1(l3) : null;
                r1aVar.x2 = X1;
                r1aVar.z2 = X1 == null;
                if (X1 != null) {
                    r1aVar.c1();
                    break;
                }
                break;
            case 4:
                HashMap hashMap = ((n2a) obj2).r;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                break;
            case 5:
                z3a z3aVar = (z3a) obj;
                g4a g4aVar = ((d4a) obj2).e;
                while (true) {
                    ArrayList arrayList = g4aVar.H;
                    if (i >= arrayList.size()) {
                        break;
                    } else {
                        if (z3aVar != arrayList.get(i)) {
                            ((z3a) arrayList.get(i)).getClass();
                        }
                        i++;
                    }
                }
            case 6:
                ym0.j(((a5a) obj2).getContext(), (TLRPC.TL_error) obj);
                break;
            case 7:
                gra graVar = (gra) obj2;
                graVar.d2.g();
                graVar.f2.O(true);
                break;
            case 8:
                hta htaVar = (hta) obj2;
                htaVar.s = new Matrix();
                htaVar.w = new Matrix();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode, tileMode);
                htaVar.r = bitmapShader;
                Paint paint = htaVar.c;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                hl.i(colorMatrix3, 0.25f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                break;
            case 9:
                eva evaVar = (eva) obj2;
                boolean e = i86.e(131072);
                if (evaVar.e != e) {
                    evaVar.e = e;
                    evaVar.invalidate();
                    break;
                }
                break;
            case 10:
                ((jxa) obj2).T((TL_stars.StarGifts) obj);
                break;
            case 11:
                ((nx0) obj2).a(((Boolean) obj).booleanValue());
                break;
            case 12:
                TextView textView = (TextView) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    boolean z = starGift instanceof TL_stars.TL_starGiftUnique;
                    int i2 = starGift.availability_remains;
                    if (!z) {
                        int i3 = starGift.availability_total;
                        textView.setText(i2 <= 0 ? ob6.H(',', "Gift2Availability2ValueNone", i3) : ob6.K("Gift2Availability4Value", i2, ',', ob6.E(i3, ',')));
                        break;
                    } else {
                        textView.setText(i2 <= 0 ? ob6.H(',', "Gift2QuantityIssuedNone", starGift.availability_total) : ob6.H(',', "Gift2QuantityIssued1", starGift.availability_issued).concat(ob6.H(',', "Gift2QuantityIssued2", starGift.availability_total)));
                        break;
                    }
                }
                break;
            case 13:
                ((StickersActivity) obj2).p0((View) obj);
                break;
            case 14:
                b7b b7bVar = (b7b) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                b7bVar.p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    b7bVar.m = true;
                    b7bVar.l = str;
                    b7bVar.f = TextUtils.isEmpty(str);
                    View view = b7bVar.r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = b7bVar.s;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 15:
                k8b k8bVar = (k8b) obj2;
                k8bVar.n = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                k8bVar.s = paint2;
                Bitmap bitmap2 = k8bVar.n;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap2, tileMode2, tileMode2);
                k8bVar.r = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix4 = new ColorMatrix();
                hl.i(colorMatrix4, aob.I.o() ? 0.08f : 0.25f);
                hl.h(colorMatrix4, aob.I.o() ? -0.02f : -0.07f);
                k8bVar.s.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                k8bVar.w = new Matrix();
                break;
            case 16:
                r8b r8bVar = (r8b) obj2;
                g66 g66Var = (g66) obj;
                if (g66Var != null) {
                    r8bVar.j2 = g66Var.e;
                    r8bVar.i2 = g66Var.f;
                    break;
                } else {
                    r8bVar.a1();
                    break;
                }
            case 17:
                ((n9b) obj2).n.a0.B1 = ((Integer) obj).intValue();
                break;
            case 18:
                ((rab) obj2).h((pcc) obj);
                break;
            case 19:
                ueb uebVar = (ueb) obj2;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                int i4 = uebVar.a;
                TLRPC.UserFull Y1 = uc7.s1(i4).Y1(yac.h(i4).e());
                if (Y1 != null) {
                    tL_birthday = Y1.birthday;
                    Y1.flags2 |= 32;
                    Y1.birthday = tL_birthday2;
                    jf7.Y(i4).g2(Y1, false);
                }
                ConnectionsManager.getInstance(i4).sendRequest(updatebirthday, new qn8((Object) uebVar, (Object) Y1, (Object) tL_birthday, (byte) 23), 1024);
                uc7.s1(i4).j2();
                uc7.s1(i4).v4(0L, "BIRTHDAY_SETUP");
                jn7.f(i4).k(jn7.s1, new Object[0]);
                break;
            case 20:
                ((ThemeActivity) obj2).B0((TL_account.contentSettings) obj);
                break;
            case 21:
                ((ir1) obj2).F(((Integer) obj).intValue());
                break;
            case 22:
                ((tzb) obj2).Y = (TL_stories.TL_premium_boostsStatus) obj;
                break;
            case 23:
                q9c q9cVar = (q9c) obj2;
                q9cVar.g3.R(q9cVar.U((View) obj), q9cVar.k3);
                break;
            case 24:
                ((mkc) obj2).v(true);
                break;
            case 25:
                ((VoIPService) obj2).lambda$onStartCommand$1((Boolean) obj);
                break;
            case 26:
                ((snc) ((lyc) obj2).e).m(obj);
                break;
            case 27:
                hl.c3(new vlc((wsc) obj2, (TLRPC.UserFull) obj, (byte) 19));
                break;
            case 28:
                atc atcVar = (atc) obj2;
                byte b2 = ((Integer) obj).intValue() == 0 ? (byte) 12 : (byte) 24;
                if (atcVar.a != b2) {
                    atcVar.a = b2;
                    atcVar.Y(atcVar.getParentActivity());
                    atcVar.c0();
                    atcVar.h.setText(atcVar.s != null ? ob6.V(null, null, 2131742743, Integer.valueOf(b2)) : ob6.V(null, null, 2131742741, Integer.valueOf(b2)));
                    break;
                }
                break;
            default:
                ixc ixcVar = (ixc) obj2;
                ixcVar.r = ((ArrayList) obj).size();
                wa waVar = ixcVar.a;
                if (waVar != null && (l9cVar = waVar.g3) != null && waVar.H) {
                    l9cVar.O(true);
                    break;
                }
                break;
        }
    }
}
