package vh;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0269  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        rh.t tVar;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        switch (this.a) {
            case 0:
                e1 e1Var = (e1) this.b;
                TLObject tLObject = (TLObject) this.c;
                g1 g1Var = e1Var.s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    u1 u1Var = g1Var.r;
                    int i10 = u1.y1;
                    vp.r1(u1Var.a).V3(tL_contacts_resolvedPeer.users, false);
                    vp.r1(u1Var.a).P3(tL_contacts_resolvedPeer.chats, false);
                    hs.a0(u1Var.a).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                e1Var.n = true;
                e1Var.G();
                break;
            case 1:
                ((z1) this.b).e(0.0f, 240L, (Runnable) this.c);
                break;
            case 2:
                b4 b4Var = (b4) this.b;
                View view = (View) this.c;
                b4Var.getClass();
                if (view instanceof jg.j) {
                    jg.j jVar = (jg.j) view;
                    jVar.m();
                    b4Var.A0(jVar, true);
                    break;
                }
                break;
            case 3:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(org.telegram.messenger.w0.b, cd.D0().y).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() <= 0) {
                        break;
                    } else {
                        tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                        tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 4:
                ((q20) this.b).a((Bitmap) this.c);
                break;
            case 5:
                k4.a((k4) this.b, (n5) this.c);
                break;
            case 6:
                q5.d dVar = (q5.d) this.b;
                n5 n5Var = (n5) this.c;
                k4 k4Var = (k4) dVar.d;
                Bitmap bitmap = k4Var.a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (n5Var.M0 == k4Var.a) {
                        n5Var.M0 = null;
                    }
                    k4Var.a = null;
                    k4Var.invalidate();
                    break;
                }
                break;
            case 7:
                o4 o4Var = (o4) this.b;
                Context context = (Context) this.c;
                AtomicReference atomicReference = o4Var.a;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                atomicReference.set(new r8.n(new com.google.android.gms.internal.vision.t2(context, x1Var)));
                o4Var.a(o4Var.f);
                break;
            case 8:
                ((o4) this.b).c.a((m4) this.c);
                break;
            case 9:
                n nVar = (n) this.b;
                jg.i2 i2Var = (jg.i2) this.c;
                u4 u4Var = nVar.a;
                if (i2Var.getWidth() <= 0) {
                    u4Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new d0(nVar, 12)).start();
                    break;
                } else {
                    float width = i2Var.getWidth() / u4Var.getWidth();
                    ValueAnimator valueAnimator = nVar.x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    nVar.x = ValueAnimator.ofFloat(0.0f, 1.0f);
                    nVar.x.addUpdateListener(new bg.j(nVar, u4Var.getScaleX(), width, ((i2Var.getWidth() / 2.0f) + i2Var.getX()) - ((u4Var.getWidth() / 2.0f) + u4Var.getX()), ((i2Var.getHeight() / 2.0f) + i2Var.getY()) - ((u4Var.getHeight() / 2.0f) + u4Var.getY()), 2));
                    nVar.x.addListener(new iw0(21, (Object) nVar, (Object) i2Var));
                    nVar.x.setDuration(320L);
                    nVar.x.setInterpolator(gr.h);
                    nVar.w = i2Var;
                    nVar.x.start();
                    break;
                }
            case 10:
                f5 f5Var = (f5) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList = f5Var.U1;
                f5Var.n2 = false;
                f5Var.m2 = false;
                if (tLObject2 instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                    vp.r1(f5Var.a).V3(messages_messages.users, false);
                    vp.r1(f5Var.a).P3(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TLRPC.Message message = arrayList2.get(i11);
                        i11++;
                        arrayList.add(new jj(f5Var.a, message, false, true));
                    }
                    if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList.size() < messages_messages.count) {
                        r9 = true;
                    }
                    f5Var.l2 = r9;
                    f5Var.k2 = messages_messages.next_rate;
                } else {
                    f5Var.l2 = false;
                    f5Var.k2 = 0;
                }
                f5Var.h2.O(true);
                break;
            case 11:
                f5 f5Var2 = (f5) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                f5Var2.C2 = false;
                f5Var2.T1.addAll(arrayList3);
                f5Var2.h2.O(true);
                break;
            case 12:
                n5 n5Var2 = (n5) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                n5Var2.e1 = 0;
                if (tLObject3 instanceof Vector) {
                    n5Var2.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject3;
                    for (int i12 = 0; i12 < vector.objects.size(); i12++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i12);
                        TLRPC.Document document = stickerSetCovered.cover;
                        if (document == null && !stickerSetCovered.covers.isEmpty()) {
                            document = stickerSetCovered.covers.get(0);
                        }
                        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
                            TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                            if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                                document = tL_stickerSetFullCovered.documents.get(0);
                            }
                        }
                        if (document != null) {
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_inputDocument.id = document.id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            n5Var2.V0.add(tL_inputDocument);
                        }
                    }
                    break;
                }
                break;
            case 13:
                t5 t5Var = (t5) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                if (tLObject4 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject4;
                    vp.r1(t5Var.a).V3(webpagepreview.users, false);
                    vp.r1(t5Var.a).P3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia2 = webpagepreview.media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia2;
                        if (tL_messageMediaWebPage == null) {
                            TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                            t5Var.Y1 = webPage;
                            if (t5.g1(webPage)) {
                                TLRPC.WebPage webPage2 = t5Var.Y1;
                                t5Var.X1 = webPage2 == null ? 0L : webPage2.id;
                                t5Var.Y1 = null;
                            } else {
                                t5Var.X1 = 0L;
                            }
                        } else {
                            t5Var.Y1 = null;
                            t5Var.X1 = 0L;
                        }
                        t5Var.Z1 = t5Var.X1 != 0;
                        tVar = t5Var.P1;
                        if (tVar == null) {
                            tVar.O(true);
                            break;
                        }
                    }
                }
                tL_messageMediaWebPage = null;
                if (tL_messageMediaWebPage == null) {
                }
                t5Var.Z1 = t5Var.X1 != 0;
                tVar = t5Var.P1;
                if (tVar == null) {
                }
                break;
            case 14:
                t5 t5Var2 = (t5) this.b;
                TextView textView = (TextView) this.c;
                ClipboardManager clipboardManager = (ClipboardManager) t5Var2.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.k3 k3Var = t5Var2.Q1.d;
                if ((TextUtils.isEmpty(k3Var.getText()) || TextUtils.equals(k3Var.getText(), "https://") || TextUtils.isEmpty(k3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    r9 = true;
                }
                z20.m(textView.animate().alpha(r9 ? 1.0f : 0.0f).scaleX(r9 ? 1.0f : 0.7f).scaleY(r9 ? 1.0f : 0.7f), gr.h, 300L);
                break;
            case 15:
                w6 w6Var = (w6) this.b;
                HashMap h02 = ((hs) this.c).h0();
                if (!h02.isEmpty()) {
                    org.telegram.messenger.i0.g3(new d1(16, w6Var, h02));
                    break;
                }
                break;
            case 16:
                w6 w6Var2 = (w6) this.b;
                HashMap hashMap = (HashMap) this.c;
                if (w6Var2.G1 == null) {
                    w6Var2.G1 = new HashMap();
                }
                w6Var2.G1.putAll(hashMap);
                break;
            case 17:
                d dVar2 = (d) this.b;
                Runnable runnable = (Runnable) this.c;
                if (dVar2 != null) {
                    dVar2.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 18:
                x8 x8Var = (x8) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                if (x8Var.k && !x8Var.i) {
                    x8Var.d.add(new w8(x8Var, bitmap2));
                    x8Var.k = false;
                    x8Var.n.invalidate();
                    break;
                }
                break;
            case 19:
                int[] iArr = (int[]) this.b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.c;
                int i13 = iArr[0];
                if (i13 != 0) {
                    connectionsManager.cancelRequest(i13, true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 20:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                w3 w3Var = FirebaseMessaging.l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    break;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 21:
                xa.j jVar2 = (xa.j) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource2.setResult(jVar2.a());
                    break;
                } catch (Exception e7) {
                    taskCompletionSource2.setException(e7);
                    return;
                }
            case 22:
                xh.i iVar = (xh.i) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                if (userFull != null) {
                    iVar.Y = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    iVar.a0 = starrefprogram;
                    if (starrefprogram == null) {
                        iVar.Y = true;
                        iVar.a0 = iVar.H0();
                        iVar.Z = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        iVar.Z = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = iVar.a0;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                iVar.J0(true);
                break;
            case 23:
                xh.m2 m2Var = (xh.m2) this.b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.c;
                m2Var.getClass();
                if (userFull2 != null && (botInfo = userFull2.bot_info) != null && (botappsettings = botInfo.app_settings) != null) {
                    m2Var.k(botappsettings, true);
                    break;
                }
                break;
            case 24:
                xh.m2 m2Var2 = (xh.m2) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (!m2Var2.d0) {
                    if (tL_error != null) {
                        m2Var2.o(false);
                        break;
                    } else {
                        org.telegram.messenger.i0.h3(m2Var2.u0, 60000L);
                        break;
                    }
                }
                break;
            case 25:
                xh.m2 m2Var3 = (xh.m2) this.b;
                wb Q = new cc(m2Var3.q0, m2Var3.F).Q(R.raw.contact_check, 36, org.telegram.messenger.i0.W2((String) this.c));
                Q.j = 5000;
                Q.k(true);
                break;
            case 26:
                xh.z2 z2Var = (xh.z2) this.b;
                z2Var.getMessagesController().u3(null, (TLRPC.User) this.c, null, z2Var.getClassGuid(), null, false, false);
                break;
            case 27:
                xh.z2 z2Var2 = (xh.z2) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                z2Var2.getClass();
                z2Var2.presentFragment(un.ha(connectedbotstarref.bot_id));
                break;
            case 28:
                xh.i3 i3Var = (xh.i3) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (!i3Var.T) {
                    if (tL_error2 != null) {
                        i3Var.b.dismiss();
                        break;
                    } else {
                        org.telegram.messenger.i0.h3(i3Var.U, 60000L);
                        break;
                    }
                }
                break;
            default:
                xh.i3 i3Var2 = (xh.i3) this.b;
                wb Q2 = new cc(i3Var2.b.c, i3Var2.a).Q(R.raw.contact_check, 36, org.telegram.messenger.i0.W2((String) this.c));
                Q2.j = 5000;
                Q2.k(true);
                break;
        }
    }
}
