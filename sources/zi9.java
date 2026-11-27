// default package

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zi9 implements wt3, bj9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oi9 b;

    public /* synthetic */ zi9(oi9 oi9Var, byte b) {
        this.a = b;
        this.b = oi9Var;
    }

    @Override // wt3
    public final void a(String str) {
        byte b = this.a;
        oi9 oi9Var = this.b;
        switch (b) {
            case 0:
                if (!TextUtils.isEmpty(str)) {
                    TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                    tL_inlineButtonTypeUrl.url = str;
                    oi9Var.a(tL_inlineButtonTypeUrl);
                    break;
                }
                break;
            default:
                if (!TextUtils.isEmpty(str)) {
                    TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                    tL_inlineButtonTypeCopy.copy_text = str;
                    oi9Var.a(tL_inlineButtonTypeCopy);
                    break;
                }
                break;
        }
    }

    @Override // bj9, org.webrtc.NativeLifecycleLock.NativePointerRunnable
    public final void run(long j) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j;
        this.b.a(tL_inlineButtonTypeUserProfile);
    }
}
