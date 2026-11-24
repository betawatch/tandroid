// default package

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class q2a implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ z3a b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ k27 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ k3a f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ k3a n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ HashMap s;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ TLObject y;

    public /* synthetic */ q2a(z3a z3aVar, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, k27 k27Var, String str, k3a k3aVar, boolean z, k3a k3aVar2, Object obj, HashMap hashMap, boolean z2) {
        this.b = z3aVar;
        this.c = tLObject;
        this.y = tL_messages_addPollAnswer;
        this.x = tLObject2;
        this.d = k27Var;
        this.e = str;
        this.f = k3aVar;
        this.h = z;
        this.n = k3aVar2;
        this.r = obj;
        this.s = hashMap;
        this.w = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.y;
        Object obj = this.x;
        switch (b) {
            case 0:
                TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) tLObject;
                TLObject tLObject2 = (TLObject) obj;
                TLObject tLObject3 = this.c;
                boolean z = tLObject3 instanceof TLRPC.TL_messageMediaDocument;
                z3a z3aVar = this.b;
                k27 k27Var = this.d;
                String str = this.e;
                k3a k3aVar = this.f;
                boolean z2 = this.h;
                k3a k3aVar2 = this.n;
                Object obj2 = this.r;
                HashMap hashMap = this.s;
                boolean z3 = this.w;
                if (!z) {
                    if (!(tLObject3 instanceof TLRPC.TL_messageMediaPhoto)) {
                        if (k3aVar2 != null) {
                            k3aVar2.c();
                            break;
                        }
                    } else {
                        TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject3).photo;
                        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                        tL_inputPhoto.id = photo.id;
                        tL_inputPhoto.access_hash = photo.access_hash;
                        tL_inputPhoto.file_reference = photo.file_reference;
                        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                        tL_inputMediaPhoto.id = tL_inputPhoto;
                        tL_messages_addPollAnswer.answer.input_media = tL_inputMediaPhoto;
                        z3aVar.N(tLObject2, k27Var, str, k3aVar, z2, k3aVar2, obj2, hashMap, z3);
                        break;
                    }
                } else {
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject3).document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    tL_inputMediaDocument.id = tL_inputDocument;
                    tL_messages_addPollAnswer.answer.input_media = tL_inputMediaDocument;
                    z3aVar.N(tLObject2, k27Var, str, k3aVar, z2, k3aVar2, obj2, hashMap, z3);
                    break;
                }
                break;
            default:
                d dVar = (d) obj;
                Context context = dVar.getContext();
                wjb resourceProvider = dVar.getResourceProvider();
                nj j = nj.j(((TLRPC.TL_inputMediaStakeDice) tLObject).ton_amount, oj.b);
                z3a z3aVar2 = this.b;
                TLObject tLObject4 = this.c;
                k27 k27Var2 = this.d;
                new xdb(context, resourceProvider, j, new o1a(z3aVar2, tLObject4, k27Var2, this.e, this.f, this.h, this.n, this.r, this.s, this.w, (byte) 0)).show();
                ArrayList arrayList = new ArrayList();
                arrayList.add(k27Var2);
                z3aVar2.g(arrayList);
                break;
        }
    }

    public /* synthetic */ q2a(z3a z3aVar, d dVar, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLObject tLObject, k27 k27Var, String str, k3a k3aVar, boolean z, k3a k3aVar2, Object obj, HashMap hashMap, boolean z2) {
        this.b = z3aVar;
        this.x = dVar;
        this.y = tL_inputMediaStakeDice;
        this.c = tLObject;
        this.d = k27Var;
        this.e = str;
        this.f = k3aVar;
        this.h = z;
        this.n = k3aVar2;
        this.r = obj;
        this.s = hashMap;
        this.w = z2;
    }
}
