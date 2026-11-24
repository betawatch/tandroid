// default package

import android.media.AudioManager;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class zz implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zz(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        nz nzVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                c00 c00Var = (c00) obj;
                c00Var.getClass();
                if (i != -3 && i != -2) {
                    if (i == -1) {
                        i64 i64Var = c00Var.c;
                        if (i64Var != null) {
                            i64Var.h.b(33, -1, 0).b();
                        }
                        c00Var.a();
                        c00Var.b(1);
                        break;
                    } else if (i == 1) {
                        c00Var.b(2);
                        i64 i64Var2 = c00Var.c;
                        if (i64Var2 != null) {
                            i64Var2.h.b(33, 1, 0).b();
                            break;
                        }
                    } else {
                        b00.o(i, "Unknown focus change type: ", "AudioFocusManager");
                        break;
                    }
                } else if (i != -2 && ((nzVar = c00Var.d) == null || nzVar.a != 1)) {
                    c00Var.b(4);
                    break;
                } else {
                    i64 i64Var3 = c00Var.c;
                    if (i64Var3 != null) {
                        i64Var3.h.b(33, 0, 0).b();
                    }
                    c00Var.b(3);
                    break;
                }
                break;
            default:
                MediaController mediaController = (MediaController) obj;
                String[] strArr = MediaController.W1;
                if (i != 1) {
                    mediaController.W = false;
                    break;
                }
                break;
        }
    }
}
