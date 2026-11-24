// default package

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class p23 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r23 b;
    public final /* synthetic */ b61 c;

    public /* synthetic */ p23(r23 r23Var, b61 b61Var, byte b) {
        this.a = b;
        this.b = r23Var;
        this.c = b61Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final b61 b61Var = this.c;
        final r23 r23Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 1;
                gm.c3(new Runnable() { // from class: o23
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        b61 b61Var2 = b61Var;
                        r23 r23Var2 = r23Var;
                        switch (b3) {
                            case 0:
                                b61Var2.setLoading(false);
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    r23Var2.W1 = groupcallstreamrtmpurl.url;
                                    r23Var2.X1 = groupcallstreamrtmpurl.key;
                                    r23Var2.Y1 = new SpannableStringBuilder(r23Var2.X1);
                                    r23Var2.Z1.O(true);
                                    break;
                                }
                                break;
                            default:
                                b61Var2.setLoading(false);
                                if (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    r23Var2.W1 = groupcallstreamrtmpurl2.url;
                                    r23Var2.X1 = groupcallstreamrtmpurl2.key;
                                    r23Var2.Y1 = new SpannableStringBuilder(r23Var2.X1);
                                    r23Var2.Z1.O(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 0;
                gm.c3(new Runnable() { // from class: o23
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        b61 b61Var2 = b61Var;
                        r23 r23Var2 = r23Var;
                        switch (b32) {
                            case 0:
                                b61Var2.setLoading(false);
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    r23Var2.W1 = groupcallstreamrtmpurl.url;
                                    r23Var2.X1 = groupcallstreamrtmpurl.key;
                                    r23Var2.Y1 = new SpannableStringBuilder(r23Var2.X1);
                                    r23Var2.Z1.O(true);
                                    break;
                                }
                                break;
                            default:
                                b61Var2.setLoading(false);
                                if (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    r23Var2.W1 = groupcallstreamrtmpurl2.url;
                                    r23Var2.X1 = groupcallstreamrtmpurl2.key;
                                    r23Var2.Y1 = new SpannableStringBuilder(r23Var2.X1);
                                    r23Var2.Z1.O(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
