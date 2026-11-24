// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.webrtc.EglRenderer;
import org.webrtc.GlGenericDrawer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class wc3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wc3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        boolean z = false;
        switch (this.a) {
            case 0:
                ((xc3) ((lv6) this.b).c).i.a((icc) this.c);
                break;
            case 1:
                Callable callable = (Callable) this.b;
                kd3 kd3Var = (kd3) ((l69) this.c).b;
                try {
                    kd3Var.k(callable.call());
                    break;
                } catch (Exception e) {
                    kd3Var.l(e);
                    return;
                }
            case 2:
                ((cj3) this.b).b4((TLRPC.TL_attachMenuBot) this.c);
                break;
            case 3:
                cj3 cj3Var = (cj3) this.b;
                fx0[] fx0VarArr = (fx0[]) this.c;
                fx0 fx0Var = fx0VarArr[0];
                if (fx0Var != null) {
                    fx0Var.dismiss();
                    fx0VarArr[0] = null;
                }
                gl.d3(new wf3(cj3Var, (byte) 18), 300L);
                break;
            case 4:
                cj3 cj3Var2 = (cj3) this.b;
                cj3Var2.getMessagesController().c((ArrayList) this.c, (cj3Var2.Y2 == 0 && cj3Var2.a3 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 5:
                ih3 ih3Var = (ih3) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                cj3 cj3Var3 = ih3Var.a;
                cj3Var3.J2 = null;
                bba bbaVar = cj3Var3.I2;
                if (bbaVar != null && bbaVar.h) {
                    bbaVar.e(charSequence, false);
                    break;
                }
                break;
            case 6:
                wh3 wh3Var = (wh3) this.b;
                d[] dVarArr = (d[]) this.c;
                wh3Var.b.removeSelfFromStack();
                if (dVarArr[1] != null) {
                    dVarArr[0].removeSelfFromStack();
                    dVarArr[1].finishFragment();
                    break;
                } else {
                    dVarArr[0].finishFragment();
                    break;
                }
            case 7:
                ti3 ti3Var = (ti3) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                cj3 cj3Var4 = ti3Var.b;
                boolean z2 = cj3Var4.E4(cj3Var4.f0[0]) && !cj3Var4.U1;
                cj3Var4.Q4(true, true);
                cj3Var4.G2();
                if (z2 && cj3Var4.T1 != null) {
                    HashSet hashSet = new HashSet();
                    for (int i = 0; i < arrayList.size(); i++) {
                        hashSet.add(Long.valueOf(((TLRPC.Dialog) arrayList.get(i)).id));
                    }
                    int size = cj3Var4.T1.size() - 1;
                    boolean z3 = false;
                    while (size >= 0) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) cj3Var4.T1.get(size);
                        if (!(dialog instanceof TLRPC.TL_dialogFolder) && hashSet.contains(Long.valueOf(dialog.id)) && cj3Var4.D4(cj3Var4.f0[0], dialog)) {
                            cj3Var4.T1.remove(size);
                            z3 = true;
                        }
                        size--;
                        z3 = z3;
                    }
                    if (z3) {
                        cj3Var4.f0[0].b(false);
                    }
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    long j2 = ((TLRPC.Dialog) arrayList.get(i2)).id;
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList.get(i2);
                    if (cj3Var4.getMessagesController().r2(j2) || cj3Var4.getMessagesController().y2(j2)) {
                        na7 messagesController = cj3Var4.getMessagesController();
                        ad7 messagesStorage = messagesController.getMessagesStorage();
                        j = j2;
                        messagesStorage.a.c(new de2((Object) messagesStorage, j, (Object) new x67(messagesController, j2), (byte) 5));
                    } else {
                        j = j2;
                    }
                    cj3Var4.getMessagesController().q3(j, 0L);
                    int i3 = dialog2.top_message;
                    cj3Var4.getMessagesController().l3(j, i3, i3, dialog2.last_message_date, false, 0L, 0, true, 0);
                }
                break;
            case 8:
                ((ti3) this.b).d((t97) this.c);
                break;
            case 9:
                uj3 uj3Var = (uj3) this.b;
                TLObject tLObject = (TLObject) this.c;
                qj3 qj3Var = uj3Var.b;
                ArrayList arrayList2 = uj3Var.h;
                int i4 = uj3Var.a;
                if (tLObject instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject;
                    na7.q1(i4).b4(popularappbots.users, false);
                    ad7.Y(i4).j1(popularappbots.users, null, false, true);
                    arrayList2.addAll(popularappbots.users);
                    String str = popularappbots.next_offset;
                    uj3Var.g = str;
                    uj3Var.e = str == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    uj3Var.f = currentTimeMillis;
                    if (!uj3Var.i) {
                        uj3Var.i = true;
                        String str2 = uj3Var.g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        ArrayList arrayList3 = new ArrayList();
                        for (int i5 = 0; i5 < arrayList2.size(); i5 = mue.c(i5, 1, ((TLRPC.User) arrayList2.get(i5)).id, arrayList3)) {
                        }
                        ad7 Y = ad7.Y(i4);
                        Y.a.c(new o77((Object) uj3Var, (Object) Y, (Object) arrayList3, currentTimeMillis, (Object) str3, (byte) 5));
                    }
                    uj3Var.c = false;
                    qj3Var.run();
                    break;
                } else {
                    uj3Var.g = null;
                    uj3Var.e = true;
                    uj3Var.c = false;
                    qj3Var.run();
                    break;
                }
            case 10:
                bl3 bl3Var = (bl3) this.b;
                View view = (View) this.c;
                bl3Var.n0 = false;
                bl3Var.p0 = null;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 11:
                mt9 mt9Var = (mt9) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i6 = mt9Var.t0;
                ArrayList arrayList4 = mt9Var.L;
                mt9Var.T = 0;
                if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (!arrayList4.isEmpty()) {
                        arrayList4.clear();
                        mt9Var.f();
                        break;
                    }
                } else if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject2;
                    na7.q1(i6).b4(tL_contacts_sponsoredPeers.users, true);
                    na7.q1(i6).V3(tL_contacts_sponsoredPeers.chats, true);
                    arrayList4.addAll(tL_contacts_sponsoredPeers.peers);
                    mt9Var.f();
                    break;
                }
                break;
            case 12:
                mt9 mt9Var2 = (mt9) this.b;
                StringBuilder sb = (StringBuilder) this.c;
                mt9Var2.getClass();
                try {
                    sb.insert(0, "DELETE FROM search_recent WHERE ");
                    ad7.Y(mt9Var2.t0).b.executeFast(sb.toString()).stepThis().dispose();
                    break;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            case 13:
                ((hl3) this.b).b((ArrayList) this.c);
                break;
            case 14:
                ((jl3) this.b).c(null, ((TLRPC.TL_composedMessageWithAI) this.c).result_text.text);
                break;
            case 15:
                boolean[] zArr = (boolean[]) this.b;
                n3b n3bVar = (n3b) this.c;
                vl3[] vl3VarArr = DictationAsr.a;
                if (!zArr[0]) {
                    n3bVar.a(null, null, true);
                    break;
                }
                break;
            case 16:
                boolean[] zArr2 = (boolean[]) this.b;
                ul3 ul3Var = (ul3) this.c;
                vl3[] vl3VarArr2 = DictationAsr.a;
                if (!zArr2[0]) {
                    ul3Var.a(null, null, true);
                    break;
                }
                break;
            case 17:
                am3 am3Var = (am3) this.b;
                gn3 gn3Var = (gn3) this.c;
                byte[] bArr = new byte[3200];
                while (!am3Var.d) {
                    int read = am3Var.e.read(bArr, 0, 3200);
                    if (read <= 0) {
                        if (read < 0) {
                            Log.d("Dictation", "audio read " + read);
                            break;
                        }
                    } else {
                        am3Var.a(read, bArr);
                        int i7 = read / 2;
                        double d = 0.0d;
                        for (int i8 = 0; i8 < i7; i8++) {
                            int i9 = i8 << 1;
                            double d2 = (short) ((bArr[i9] & 255) | (bArr[i9 + 1] << 8));
                            d += d2 * d2;
                        }
                        gn3Var.a((float) Math.max(0.0d, Math.min(1.0d, ((Math.log10(Math.max(1.0d, Math.sqrt(d / Math.max(1, i7)))) * 20.0d) - 42.0d) / 30.0d)));
                    }
                }
                break;
            case 18:
                ((jm3) this.b).A((String) this.c);
                break;
            case 19:
                ((jm3) this.b).c((kl3) this.c);
                break;
            case 20:
                jm3 jm3Var = (jm3) this.b;
                ln3 ln3Var = (ln3) this.c;
                if (jm3Var.G == ln3Var && jm3Var.r == 1) {
                    ln3Var.l();
                    break;
                }
                break;
            case 21:
                ((be2) this.b).a((kl3) this.c);
                break;
            case 22:
                gl.c3(new sm3(this.c, DictationLid.j((byte[]) this.b).length / 32, (byte) (z ? 1 : 0)));
                break;
            case 23:
                ln3 ln3Var2 = (ln3) this.b;
                Runnable runnable = (Runnable) this.c;
                if (!ln3Var2.h) {
                    runnable.run();
                    break;
                }
                break;
            case 24:
                eo3 eo3Var = (eo3) this.b;
                do3 do3Var = (do3) this.c;
                eo3Var.g--;
                SparseIntArray sparseIntArray = eo3Var.b;
                int i10 = sparseIntArray.get(do3Var.index) - 1;
                int i11 = do3Var.index;
                if (i10 == 0) {
                    sparseIntArray.delete(i11);
                    eo3Var.c.remove(do3Var);
                    eo3Var.a.add(do3Var);
                    break;
                } else {
                    sparseIntArray.put(i11, i10);
                    break;
                }
            case 25:
                ss3 ss3Var = (ss3) this.b;
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(gl.L(26.0f), gl.L(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r2.getWidth() / 2.0f, r2.getHeight() / 2.0f);
                float max = Math.max(r2.getWidth() / decodeFile.getWidth(), r2.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                gl.c3(new wc3(ss3Var, decodeFile, (byte) 26));
                break;
            case 26:
                ((ss3) this.b).setImage((Bitmap) this.c);
                break;
            case 27:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                Canvas canvas2 = (Canvas) this.c;
                Field field = EditTextBoldCursor.E1;
                editTextBoldCursor.p0.draw(canvas2);
                break;
            case 28:
                ((EglRenderer) this.b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.c);
                break;
            default:
                ((EglRenderer) this.b).lambda$release$1((CountDownLatch) this.c);
                break;
        }
    }
}
