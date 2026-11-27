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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.webrtc.EglRenderer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wd3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wd3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        switch (this.a) {
            case 0:
                Callable callable = (Callable) this.b;
                de3 de3Var = (de3) ((z8d) this.c).b;
                try {
                    de3Var.k(callable.call());
                    break;
                } catch (Exception e) {
                    de3Var.l(e);
                    return;
                }
            case 1:
                ((uj3) this.b).e4((TLRPC.TL_attachMenuBot) this.c);
                break;
            case 2:
                uj3 uj3Var = (uj3) this.b;
                nx0[] nx0VarArr = (nx0[]) this.c;
                nx0 nx0Var = nx0VarArr[0];
                if (nx0Var != null) {
                    nx0Var.dismiss();
                    nx0VarArr[0] = null;
                }
                hl.d3(new rg3(uj3Var, (byte) 27), 300L);
                break;
            case 3:
                uj3 uj3Var2 = (uj3) this.b;
                uj3Var2.getMessagesController().c((ArrayList) this.c, (uj3Var2.Y2 == 0 && uj3Var2.a3 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 4:
                ci3 ci3Var = (ci3) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                uj3 uj3Var3 = ci3Var.a;
                uj3Var3.J2 = null;
                sea seaVar = uj3Var3.I2;
                if (seaVar != null && seaVar.h) {
                    seaVar.e(charSequence, false);
                    break;
                }
                break;
            case 5:
                qi3 qi3Var = (qi3) this.b;
                e[] eVarArr = (e[]) this.c;
                qi3Var.b.removeSelfFromStack();
                if (eVarArr[1] != null) {
                    eVarArr[0].removeSelfFromStack();
                    eVarArr[1].finishFragment();
                    break;
                } else {
                    eVarArr[0].finishFragment();
                    break;
                }
            case 6:
                lj3 lj3Var = (lj3) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                uj3 uj3Var4 = lj3Var.b;
                boolean z = uj3Var4.I4(uj3Var4.f0[0]) && !uj3Var4.U1;
                uj3Var4.U4(true, true);
                uj3Var4.I2();
                if (z && uj3Var4.T1 != null) {
                    HashSet hashSet = new HashSet();
                    for (int i = 0; i < arrayList.size(); i++) {
                        hashSet.add(Long.valueOf(((TLRPC.Dialog) arrayList.get(i)).id));
                    }
                    boolean z2 = false;
                    for (int size = uj3Var4.T1.size() - 1; size >= 0; size--) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) uj3Var4.T1.get(size);
                        if (!(dialog instanceof TLRPC.TL_dialogFolder) && hashSet.contains(Long.valueOf(dialog.id)) && uj3Var4.H4(uj3Var4.f0[0], dialog)) {
                            uj3Var4.T1.remove(size);
                            z2 = true;
                        }
                    }
                    if (z2) {
                        uj3Var4.f0[0].b(false);
                    }
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    long j2 = ((TLRPC.Dialog) arrayList.get(i2)).id;
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList.get(i2);
                    if (uj3Var4.getMessagesController().v2(j2) || uj3Var4.getMessagesController().C2(j2)) {
                        uc7 messagesController = uj3Var4.getMessagesController();
                        kf7 messagesStorage = messagesController.getMessagesStorage();
                        j = j2;
                        messagesStorage.a.c(new ue2((Object) messagesStorage, j, (Object) new y97(messagesController, j2), (byte) 5));
                    } else {
                        j = j2;
                    }
                    uj3Var4.getMessagesController().w3(j, 0L);
                    int i3 = dialog2.top_message;
                    uj3Var4.getMessagesController().r3(j, i3, i3, dialog2.last_message_date, false, 0L, 0, true, 0);
                }
                break;
            case 7:
                ((lj3) this.b).c((ac7) this.c);
                break;
            case 8:
                mk3 mk3Var = (mk3) this.b;
                TLObject tLObject = (TLObject) this.c;
                ik3 ik3Var = mk3Var.b;
                ArrayList arrayList2 = mk3Var.h;
                int i4 = mk3Var.a;
                if (tLObject instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject;
                    uc7.s1(i4).j4(popularappbots.users, false);
                    kf7.a0(i4).n1(popularappbots.users, null, false, true);
                    arrayList2.addAll(popularappbots.users);
                    String str = popularappbots.next_offset;
                    mk3Var.g = str;
                    mk3Var.e = str == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    mk3Var.f = currentTimeMillis;
                    if (!mk3Var.i) {
                        mk3Var.i = true;
                        String str2 = mk3Var.g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        ArrayList arrayList3 = new ArrayList();
                        for (int i5 = 0; i5 < arrayList2.size(); i5 = dze.c(i5, 1, ((TLRPC.User) arrayList2.get(i5)).id, arrayList3)) {
                        }
                        kf7 a0 = kf7.a0(i4);
                        a0.a.c(new da7((Object) mk3Var, (Object) a0, (Object) arrayList3, currentTimeMillis, (Object) str3, (byte) 5));
                    }
                    mk3Var.c = false;
                    ik3Var.run();
                    break;
                } else {
                    mk3Var.g = null;
                    mk3Var.e = true;
                    mk3Var.c = false;
                    ik3Var.run();
                    break;
                }
            case 9:
                tl3 tl3Var = (tl3) this.b;
                View view = (View) this.c;
                tl3Var.n0 = false;
                tl3Var.p0 = null;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 10:
                gx9 gx9Var = (gx9) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i6 = gx9Var.t0;
                ArrayList arrayList4 = gx9Var.L;
                gx9Var.T = 0;
                if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (!arrayList4.isEmpty()) {
                        arrayList4.clear();
                        gx9Var.f();
                        break;
                    }
                } else if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject2;
                    uc7.s1(i6).j4(tL_contacts_sponsoredPeers.users, true);
                    uc7.s1(i6).c4(tL_contacts_sponsoredPeers.chats, true);
                    arrayList4.addAll(tL_contacts_sponsoredPeers.peers);
                    gx9Var.f();
                    break;
                }
                break;
            case 11:
                gx9 gx9Var2 = (gx9) this.b;
                StringBuilder sb = (StringBuilder) this.c;
                gx9Var2.getClass();
                try {
                    sb.insert(0, "DELETE FROM search_recent WHERE ");
                    kf7.a0(gx9Var2.t0).b.executeFast(sb.toString()).stepThis().dispose();
                    break;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 12:
                ((zl3) this.b).b((ArrayList) this.c);
                break;
            case 13:
                ((bm3) this.b).c(null, ((TLRPC.TL_composedMessageWithAI) this.c).result_text.text);
                break;
            case 14:
                boolean[] zArr = (boolean[]) this.b;
                mm3 mm3Var = (mm3) this.c;
                nm3[] nm3VarArr = DictationAsr.a;
                if (!zArr[0]) {
                    mm3Var.a(null, null, true);
                    break;
                }
                break;
            case 15:
                boolean[] zArr2 = (boolean[]) this.b;
                j7b j7bVar = (j7b) this.c;
                nm3[] nm3VarArr2 = DictationAsr.a;
                if (!zArr2[0]) {
                    j7bVar.a(null, null, true);
                    break;
                }
                break;
            case 16:
                sm3 sm3Var = (sm3) this.b;
                xn3 xn3Var = (xn3) this.c;
                byte[] bArr = new byte[3200];
                while (!sm3Var.d) {
                    int read = sm3Var.e.read(bArr, 0, 3200);
                    if (read <= 0) {
                        if (read < 0) {
                            Log.d("Dictation", "audio read " + read);
                            break;
                        }
                    } else {
                        sm3Var.a(read, bArr);
                        int i7 = read / 2;
                        double d = 0.0d;
                        for (int i8 = 0; i8 < i7; i8++) {
                            int i9 = i8 << 1;
                            double d2 = (short) ((bArr[i9] & 255) | (bArr[i9 + 1] << 8));
                            d += d2 * d2;
                        }
                        xn3Var.a((float) Math.max(0.0d, Math.min(1.0d, ((Math.log10(Math.max(1.0d, Math.sqrt(d / Math.max(1, i7)))) * 20.0d) - 42.0d) / 30.0d)));
                    }
                }
                break;
            case 17:
                ((bn3) this.b).c((cm3) this.c);
                break;
            case 18:
                bn3 bn3Var = (bn3) this.b;
                co3 co3Var = (co3) this.c;
                if (bn3Var.G == co3Var && bn3Var.r == 1) {
                    co3Var.l();
                    break;
                }
                break;
            case 19:
                ((te2) this.b).a((cm3) this.c);
                break;
            case 20:
                hl.c3(new hl3(this.c, DictationLid.k((byte[]) this.b).length / 32, (byte) 2));
                break;
            case 21:
                co3 co3Var2 = (co3) this.b;
                Runnable runnable = (Runnable) this.c;
                if (!co3Var2.h) {
                    runnable.run();
                    break;
                }
                break;
            case 22:
                vo3 vo3Var = (vo3) this.b;
                uo3 uo3Var = (uo3) this.c;
                vo3Var.g--;
                SparseIntArray sparseIntArray = vo3Var.b;
                int i10 = sparseIntArray.get(uo3Var.index) - 1;
                int i11 = uo3Var.index;
                if (i10 == 0) {
                    sparseIntArray.delete(i11);
                    vo3Var.c.remove(uo3Var);
                    vo3Var.a.add(uo3Var);
                    break;
                } else {
                    sparseIntArray.put(i11, i10);
                    break;
                }
            case 23:
                kt3 kt3Var = (kt3) this.b;
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(hl.L(26.0f), hl.L(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r2.getWidth() / 2.0f, r2.getHeight() / 2.0f);
                float max = Math.max(r2.getWidth() / decodeFile.getWidth(), r2.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                hl.c3(new wd3(kt3Var, decodeFile, (byte) 24));
                break;
            case 24:
                ((kt3) this.b).setImage((Bitmap) this.c);
                break;
            case 25:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                Canvas canvas2 = (Canvas) this.c;
                Field field = EditTextBoldCursor.F1;
                editTextBoldCursor.p0.draw(canvas2);
                break;
            case 26:
                ((EglRenderer) this.b).lambda$releaseEglSurface$4((Runnable) this.c);
                break;
            case 27:
                ((EglRenderer) this.b).lambda$release$0((CountDownLatch) this.c);
                break;
            case 28:
                tv3 tv3Var = (tv3) this.b;
                r47 r47Var = (r47) this.c;
                zu1 zu1Var = tv3Var.a;
                s4b s4bVar = new s4b(zu1Var.getParentActivity(), tv3Var.a, r47.j1(r47Var.k), null, zu1Var.a0, zu1Var.getResourceProvider());
                boolean Y7 = zu1Var.Y7();
                s4bVar.i0 = Y7;
                s4bVar.n = Y7;
                zu1Var.showDialog(s4bVar);
                break;
            default:
                fw3 fw3Var = (fw3) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                hw3 hw3Var = fw3Var.s;
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    zw3 zw3Var = hw3Var.r;
                    int i12 = zw3.C1;
                    uc7.s1(zw3Var.a).j4(tL_contacts_resolvedPeer.users, false);
                    uc7.s1(zw3Var.a).c4(tL_contacts_resolvedPeer.chats, false);
                    kf7.a0(zw3Var.a).n1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                fw3Var.n = true;
                fw3Var.F();
                break;
        }
    }
}
