package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ wh(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        wn wnVar = this.b;
        switch (i10) {
            case 0:
                FrameLayout.LayoutParams i11 = org.telegram.ui.Components.kb1.i(-1, -2, 87);
                i11.bottomMargin = wnVar.Y.getMeasuredHeight();
                wnVar.j1.addView(wnVar.K1, i11);
                wnVar.K1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                wnVar.K1.m(0.0f, wnVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                wnVar.K1.u();
                break;
            case 1:
                int i12 = wn.fd;
                wnVar.i7();
                break;
            case 2:
                int i13 = wn.fd;
                wnVar.i7();
                break;
            case 3:
                wn.m2(wnVar);
                break;
            case 4:
                wn.m2(wnVar);
                break;
            case 5:
                int i14 = wn.fd;
                wnVar.Ya();
                break;
            case 6:
                int i15 = wn.fd;
                wnVar.Ya();
                break;
            case 7:
                int i16 = wn.fd;
                wnVar.Ya();
                break;
            case 8:
                int i17 = wn.fd;
                wnVar.Ya();
                break;
            case 9:
                int i18 = wn.fd;
                wnVar.Ya();
                break;
            case 10:
                int i19 = wn.fd;
                wnVar.Ya();
                break;
            case 11:
                int i20 = wn.fd;
                wnVar.Ya();
                break;
            default:
                int i21 = wn.fd;
                wnVar.Ya();
                break;
        }
    }
}
