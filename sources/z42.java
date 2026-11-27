// default package

import android.os.Build;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class z42 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ z42(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, byte b) {
        this.a = b;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (b) {
            case 0:
                boolean z = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout.b.c.removeView(chatAttachAlertPhotoLayout.Q);
                chatAttachAlertPhotoLayout.Q = null;
                break;
            case 1:
                boolean z2 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout.x.setVisibility(8);
                break;
            case 2:
                boolean z3 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout.w0(false);
                chatAttachAlertPhotoLayout.o0 = null;
                break;
            case 3:
                boolean z4 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout.w0(false);
                chatAttachAlertPhotoLayout.o0 = null;
                break;
            case 4:
                boolean z5 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout.H.f();
                break;
            case 5:
                boolean z6 = ChatAttachAlertPhotoLayout.r1;
                n12 n12Var = chatAttachAlertPhotoLayout.b;
                if (sr.b(n12Var.Z1.getParentActivity(), "android.permission.CAMERA") == 0) {
                    chatAttachAlertPhotoLayout.k0();
                    break;
                } else {
                    try {
                        n12Var.Z1.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
            default:
                boolean z7 = ChatAttachAlertPhotoLayout.r1;
                try {
                    int i = Build.VERSION.SDK_INT;
                    n12 n12Var2 = chatAttachAlertPhotoLayout.b;
                    if (i >= 33) {
                        n12Var2.Z1.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else {
                        n12Var2.Z1.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
