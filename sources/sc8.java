// default package

import android.graphics.RectF;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class sc8 implements j8c, ed, eja, OnCompleteListener, yc3, o8c, js4, Vector.TLDeserializer, NativeInstance.AudioLevelsCallback, m74 {
    public final /* synthetic */ byte a;

    public /* synthetic */ sc8(byte b) {
        this.a = b;
    }

    public static /* synthetic */ void e() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void i(Object obj, Object obj2, String str) {
        throw new gp2(str + obj + obj2);
    }

    public static /* synthetic */ void j(String str) {
        throw new IllegalStateException(str);
    }

    @Override // o8c
    public final Boolean d(c4c c4cVar, View view, Integer num, Float f, Float f2) {
        return Boolean.FALSE;
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TL_iv.RichText.TLdeserialize(inputSerializedData, i, z);
    }

    @Override // m74
    public final j74[] f(Uri uri, Map map) {
        return new j74[]{new pb3()};
    }

    @Override // j8c
    public final Object g(Integer num, Object obj) {
        return num.intValue() == 0 ? jva.a1(false, k96.H(',', "Stars", ((Integer) obj).intValue()), 0.66f, null) : k96.E(r4.intValue(), ',');
    }

    @Override // yc3
    public final void h(mt8 mt8Var) {
        mt8Var.get().getClass();
        throw new ClassCastException();
    }

    @Override // eja
    public final void k(int i) {
        gba.Y0 = i;
        gba.x();
    }

    @Override // js4
    public final Object m(Object obj) {
        int i = y99.f2;
        return 0;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        gba.i = SystemClock.elapsedRealtime();
        if (task.isSuccessful()) {
            String str = (String) task.getResult();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            PushListenerController.sendRegistrationToServer(2, str);
            return;
        }
        if (w01.a) {
            fa4.b("Failed to get regid");
        }
        gba.g = "__FIREBASE_FAILED__";
        PushListenerController.sendRegistrationToServer(2, null);
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        switch (this.a) {
            case 2:
                RectF rectF = ProfileActivity.Z6;
                hdVar.dismiss();
                break;
            case 3:
                hdVar.dismiss();
                break;
            case 4:
            default:
                hdVar.dismiss();
                break;
            case 5:
                hdVar.dismiss();
                break;
        }
    }

    public /* synthetic */ sc8(Object obj, byte b) {
        this.a = b;
    }

    @Override // eja
    public final void n() {
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public final void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }
}
