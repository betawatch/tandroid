package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class re implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ re(co coVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, boolean z10, boolean z11) {
        this.e = coVar;
        this.c = str;
        this.f = characterStyle;
        this.h = messageObject;
        this.n = t1Var;
        this.b = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                co coVar = (co) this.e;
                String str = (String) this.c;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.n;
                if (!str.startsWith("video?")) {
                    if (this.b && !this.d) {
                        coVar.getParentActivity();
                        of.f.n(str);
                        break;
                    } else {
                        coVar.J9(messageObject, false, false);
                        coVar.Z9(characterStyle, str, false, t1Var, messageObject);
                        break;
                    }
                } else {
                    coVar.U7(characterStyle, false, messageObject, t1Var);
                    break;
                }
                break;
            case 1:
                xh.n nVar = (xh.n) this.e;
                Runnable runnable = (Runnable) this.f;
                String str2 = (String) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.n;
                nVar.w = false;
                nVar.z = true;
                if (this.b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                xh.n.k(nVar.q, false, false);
                if (TextUtils.equals(str2, nVar.t) && tL_error == null) {
                    nVar.z = true;
                    nVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.d, false);
                    break;
                }
                break;
            default:
                zh.w3.A0((zh.w3) this.e, (TLObject) this.c, this.b, (TLRPC.Document) this.f, this.d, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.n);
                break;
        }
    }

    public /* synthetic */ re(xh.n nVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.e = nVar;
        this.b = z10;
        this.f = runnable;
        this.c = str;
        this.h = tL_error;
        this.n = tLObject;
        this.d = z11;
    }

    public /* synthetic */ re(zh.w3 w3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.e = w3Var;
        this.c = tLObject;
        this.b = z10;
        this.f = document;
        this.d = z11;
        this.h = tL_error;
        this.n = savestargift;
    }
}
