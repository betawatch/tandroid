// default package

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class w13 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y13 b;
    public final /* synthetic */ c51 c;

    public /* synthetic */ w13(y13 y13Var, c51 c51Var, byte b) {
        this.a = b;
        this.b = y13Var;
        this.c = c51Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final c51 c51Var = this.c;
        final y13 y13Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 0;
                hl.c3(new Runnable() { // from class: v13
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        c51 c51Var2 = c51Var;
                        y13 y13Var2 = y13Var;
                        switch (b3) {
                            case 0:
                                c51Var2.setLoading(false);
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    y13Var2.W1 = groupcallstreamrtmpurl.url;
                                    y13Var2.X1 = groupcallstreamrtmpurl.key;
                                    y13Var2.Y1 = new SpannableStringBuilder(y13Var2.X1);
                                    y13Var2.Z1.O(true);
                                    break;
                                }
                                break;
                            default:
                                c51Var2.setLoading(false);
                                if (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    y13Var2.W1 = groupcallstreamrtmpurl2.url;
                                    y13Var2.X1 = groupcallstreamrtmpurl2.key;
                                    y13Var2.Y1 = new SpannableStringBuilder(y13Var2.X1);
                                    y13Var2.Z1.O(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 1;
                hl.c3(new Runnable() { // from class: v13
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        c51 c51Var2 = c51Var;
                        y13 y13Var2 = y13Var;
                        switch (b32) {
                            case 0:
                                c51Var2.setLoading(false);
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    y13Var2.W1 = groupcallstreamrtmpurl.url;
                                    y13Var2.X1 = groupcallstreamrtmpurl.key;
                                    y13Var2.Y1 = new SpannableStringBuilder(y13Var2.X1);
                                    y13Var2.Z1.O(true);
                                    break;
                                }
                                break;
                            default:
                                c51Var2.setLoading(false);
                                if (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    y13Var2.W1 = groupcallstreamrtmpurl2.url;
                                    y13Var2.X1 = groupcallstreamrtmpurl2.key;
                                    y13Var2.Y1 = new SpannableStringBuilder(y13Var2.X1);
                                    y13Var2.Z1.O(true);
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
