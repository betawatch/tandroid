// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Callable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.webrtc.EglRenderer;
import org.webrtc.GlGenericDrawer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rd3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rd3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = 1;
        switch (this.a) {
            case 0:
                sd3 sd3Var = (sd3) this.b;
                d dVar = (d) this.c;
                ud3 ud3Var = (ud3) sd3Var.c;
                ud3Var.a();
                ud3Var.c();
                int w0 = cmb.w0(null, cmb.p6, false);
                p09 p09Var = ud3Var.d;
                p09Var.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
                boolean i1 = cmb.i1();
                xib xibVar = ud3Var.e;
                if (i1) {
                    xibVar.p(jb6.M0(2131745200, null), p09Var, true);
                    xibVar.x += 2;
                } else {
                    xibVar.p(jb6.M0(2131745201, null), p09Var, true);
                    xibVar.x += 2;
                }
                cmb.K1(dVar);
                break;
            case 1:
                ((je3) ((hi2) this.b).c).i.a((jec) this.c);
                break;
            case 2:
                Callable callable = (Callable) this.b;
                we3 we3Var = (we3) ((k6d) this.c).b;
                try {
                    we3Var.k(callable.call());
                    break;
                } catch (Exception e) {
                    we3Var.l(e);
                    return;
                }
            case 3:
                ((nk3) this.b).e4((TLRPC.TL_attachMenuBot) this.c);
                break;
            case 4:
                nk3 nk3Var = (nk3) this.b;
                my0[] my0VarArr = (my0[]) this.c;
                my0 my0Var = my0VarArr[0];
                if (my0Var != null) {
                    my0Var.dismiss();
                    my0VarArr[0] = null;
                }
                gm.d3(new kh3(nk3Var, (byte) 18), 300L);
                break;
            case 5:
                nk3 nk3Var2 = (nk3) this.b;
                nk3Var2.getMessagesController().c((ArrayList) this.c, (nk3Var2.Y2 == 0 && nk3Var2.a3 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 6:
                ui3 ui3Var = (ui3) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                nk3 nk3Var3 = ui3Var.a;
                nk3Var3.J2 = null;
                bda bdaVar = nk3Var3.I2;
                if (bdaVar != null && bdaVar.h) {
                    bdaVar.e(charSequence, false);
                    break;
                }
                break;
            case 7:
                ij3 ij3Var = (ij3) this.b;
                d[] dVarArr = (d[]) this.c;
                ij3Var.b.removeSelfFromStack();
                if (dVarArr[1] != null) {
                    dVarArr[0].removeSelfFromStack();
                    dVarArr[1].finishFragment();
                    break;
                } else {
                    dVarArr[0].finishFragment();
                    break;
                }
            case 8:
                dk3 dk3Var = (dk3) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                nk3 nk3Var4 = dk3Var.b;
                boolean z = nk3Var4.I4(nk3Var4.f0[0]) && !nk3Var4.U1;
                nk3Var4.U4(true, true);
                nk3Var4.I2();
                if (z && nk3Var4.T1 != null) {
                    HashSet hashSet = new HashSet();
                    for (int i = 0; i < arrayList.size(); i++) {
                        hashSet.add(Long.valueOf(((TLRPC.Dialog) arrayList.get(i)).id));
                    }
                    boolean z2 = false;
                    for (int size = nk3Var4.T1.size() - 1; size >= 0; size--) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) nk3Var4.T1.get(size);
                        if (!(dialog instanceof TLRPC.TL_dialogFolder) && hashSet.contains(Long.valueOf(dialog.id)) && nk3Var4.H4(nk3Var4.f0[0], dialog)) {
                            nk3Var4.T1.remove(size);
                            z2 = true;
                        }
                    }
                    if (z2) {
                        nk3Var4.f0[0].b(false);
                    }
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    long j = ((TLRPC.Dialog) arrayList.get(i2)).id;
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList.get(i2);
                    if (nk3Var4.getMessagesController().s2(j) || nk3Var4.getMessagesController().z2(j)) {
                        oc7 messagesController = nk3Var4.getMessagesController();
                        cf7 messagesStorage = messagesController.getMessagesStorage();
                        v87 v87Var = new v87(messagesController, j);
                        mp3 mp3Var = messagesStorage.a;
                        of2 of2Var = new of2((Object) messagesStorage, j, (Object) v87Var, (byte) 5);
                        j = j;
                        mp3Var.c(of2Var);
                    }
                    nk3Var4.getMessagesController().s3(j, 0L);
                    oc7 messagesController2 = nk3Var4.getMessagesController();
                    int i3 = dialog2.top_message;
                    messagesController2.n3(j, i3, i3, dialog2.last_message_date, false, 0L, 0, true, 0);
                }
                break;
            case 9:
                ((dk3) this.b).d((ub7) this.c);
                break;
            case 10:
                fl3 fl3Var = (fl3) this.b;
                TLObject tLObject = (TLObject) this.c;
                bl3 bl3Var = fl3Var.b;
                ArrayList arrayList2 = fl3Var.h;
                int i4 = fl3Var.a;
                if (tLObject instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject;
                    oc7.r1(i4).d4(popularappbots.users, false);
                    cf7.Y(i4).j1(popularappbots.users, null, false, true);
                    arrayList2.addAll(popularappbots.users);
                    String str = popularappbots.next_offset;
                    fl3Var.g = str;
                    fl3Var.e = str == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    fl3Var.f = currentTimeMillis;
                    if (!fl3Var.i) {
                        fl3Var.i = true;
                        String str2 = fl3Var.g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        ArrayList arrayList3 = new ArrayList();
                        for (int i5 = 0; i5 < arrayList2.size(); i5 = mle.c(i5, 1, ((TLRPC.User) arrayList2.get(i5)).id, arrayList3)) {
                        }
                        cf7 Y = cf7.Y(i4);
                        Y.a.c(new r97((Object) fl3Var, (Object) Y, (Object) arrayList3, currentTimeMillis, (Object) str3, (byte) 5));
                    }
                    fl3Var.c = false;
                    bl3Var.run();
                    break;
                } else {
                    fl3Var.g = null;
                    fl3Var.e = true;
                    fl3Var.c = false;
                    bl3Var.run();
                    break;
                }
            case 11:
                mm3 mm3Var = (mm3) this.b;
                View view = (View) this.c;
                mm3Var.n0 = false;
                mm3Var.p0 = null;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 12:
                ov9 ov9Var = (ov9) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i6 = ov9Var.t0;
                ArrayList arrayList4 = ov9Var.L;
                ov9Var.T = 0;
                if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (!arrayList4.isEmpty()) {
                        arrayList4.clear();
                        ov9Var.f();
                        break;
                    }
                } else if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject2;
                    oc7.r1(i6).d4(tL_contacts_sponsoredPeers.users, true);
                    oc7.r1(i6).X3(tL_contacts_sponsoredPeers.chats, true);
                    arrayList4.addAll(tL_contacts_sponsoredPeers.peers);
                    ov9Var.f();
                    break;
                }
                break;
            case 13:
                ov9 ov9Var2 = (ov9) this.b;
                StringBuilder sb = (StringBuilder) this.c;
                ov9Var2.getClass();
                try {
                    sb.insert(0, "DELETE FROM search_recent WHERE ");
                    cf7.Y(ov9Var2.t0).b.executeFast(sb.toString()).stepThis().dispose();
                    break;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            case 14:
                ((sm3) this.b).b((ArrayList) this.c);
                break;
            case 15:
                ((um3) this.b).c(null, ((TLRPC.TL_composedMessageWithAI) this.c).result_text.text);
                break;
            case 16:
                boolean[] zArr = (boolean[]) this.b;
                o5b o5bVar = (o5b) this.c;
                gn3[] gn3VarArr = DictationAsr.a;
                if (!zArr[0]) {
                    o5bVar.a(null, null, true);
                    break;
                }
                break;
            case 17:
                boolean[] zArr2 = (boolean[]) this.b;
                fn3 fn3Var = (fn3) this.c;
                gn3[] gn3VarArr2 = DictationAsr.a;
                if (!zArr2[0]) {
                    fn3Var.a(null, null, true);
                    break;
                }
                break;
            case 18:
                ln3 ln3Var = (ln3) this.b;
                qo3 qo3Var = (qo3) this.c;
                byte[] bArr = new byte[3200];
                while (!ln3Var.d) {
                    int read = ln3Var.e.read(bArr, 0, 3200);
                    if (read <= 0) {
                        if (read < 0) {
                            Log.d("Dictation", "audio read " + read);
                            break;
                        }
                    } else {
                        ln3Var.a(read, bArr);
                        int i7 = read / 2;
                        double d = 0.0d;
                        for (int i8 = 0; i8 < i7; i8++) {
                            int i9 = i8 << 1;
                            double d2 = (short) ((bArr[i9] & 255) | (bArr[i9 + 1] << 8));
                            d += d2 * d2;
                        }
                        qo3Var.a((float) Math.max(0.0d, Math.min(1.0d, ((Math.log10(Math.max(1.0d, Math.sqrt(d / Math.max(1, i7)))) * 20.0d) - 42.0d) / 30.0d)));
                    }
                }
                break;
            case 19:
                ((un3) this.b).A((String) this.c);
                break;
            case 20:
                ((un3) this.b).c((vm3) this.c);
                break;
            case 21:
                un3 un3Var = (un3) this.b;
                vo3 vo3Var = (vo3) this.c;
                if (un3Var.G == vo3Var && un3Var.r == 1) {
                    vo3Var.l();
                    break;
                }
                break;
            case 22:
                ((mf2) this.b).a((vm3) this.c);
                break;
            case 23:
                gm.c3(new bm3((qy1) this.c, DictationLid.j((byte[]) this.b).length / 32, b));
                break;
            case 24:
                vo3 vo3Var2 = (vo3) this.b;
                Runnable runnable = (Runnable) this.c;
                if (!vo3Var2.h) {
                    runnable.run();
                    break;
                }
                break;
            case 25:
                op3 op3Var = (op3) this.b;
                np3 np3Var = (np3) this.c;
                op3Var.g--;
                SparseIntArray sparseIntArray = op3Var.b;
                int i10 = sparseIntArray.get(np3Var.index) - 1;
                int i11 = np3Var.index;
                if (i10 == 0) {
                    sparseIntArray.delete(i11);
                    op3Var.c.remove(np3Var);
                    op3Var.a.add(np3Var);
                    break;
                } else {
                    sparseIntArray.put(i11, i10);
                    break;
                }
            case 26:
                cu3 cu3Var = (cu3) this.b;
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(gm.L(26.0f), gm.L(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r2.getWidth() / 2.0f, r2.getHeight() / 2.0f);
                float max = Math.max(r2.getWidth() / decodeFile.getWidth(), r2.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                gm.c3(new rd3(cu3Var, decodeFile, (byte) 27));
                break;
            case 27:
                ((cu3) this.b).setImage((Bitmap) this.c);
                break;
            case 28:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                Canvas canvas2 = (Canvas) this.c;
                Field field = EditTextBoldCursor.E1;
                editTextBoldCursor.p0.draw(canvas2);
                break;
            default:
                ((EglRenderer) this.b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.c);
                break;
        }
    }
}
