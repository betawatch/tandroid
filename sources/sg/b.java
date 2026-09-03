package sg;

import android.graphics.Color;
import eg.f0;
import k7.o;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import rg.d;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class b {
    public static d a(g6 g6Var) {
        d dVar = new d(g6Var);
        dVar.e = new s0.b(28);
        dVar.d(385875968, 402653183);
        dVar.c(385875968, 402653183);
        dVar.b(285212672, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        dVar.n = dpf2;
        dVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        dVar.f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static d b(g6 g6Var) {
        d dVar = new d(g6Var);
        dVar.e = new f0(1, g6Var);
        dVar.d(-1, 687865855);
        dVar.c(-1, 352321535);
        dVar.b(TLObject.FLAG_29, 0);
        float dpf2 = AndroidUtilities.dpf2(0.5f);
        float dpf22 = AndroidUtilities.dpf2(0.5f);
        dVar.f = dpf2;
        dVar.h = dpf22;
        return dVar;
    }

    public static boolean c(int i10, g6 g6Var) {
        boolean a2 = g6Var != null ? g6Var.a() : k6.I.q();
        boolean chatBlurEnabled = SharedConfig.chatBlurEnabled();
        if (chatBlurEnabled && !a2 && MessagesController.getInstance(i10).config.disableBlurInLightTheme.get()) {
            chatBlurEnabled = false;
        }
        if (chatBlurEnabled && a2 && MessagesController.getInstance(i10).config.disableBlurInDarkTheme.get()) {
            return false;
        }
        return chatBlurEnabled;
    }

    public static d d(g6 g6Var) {
        d dVar = new d(g6Var);
        dVar.e = new a(2);
        dVar.d(-1, 687865855);
        dVar.c(-1, 352321535);
        dVar.b(TLObject.FLAG_30, 0);
        float dpf2 = AndroidUtilities.dpf2(3.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar.n = dpf2;
        dVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.5f);
        float dpf24 = AndroidUtilities.dpf2(0.5f);
        dVar.f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static d e(g6 g6Var) {
        d dVar = new d(g6Var);
        dVar.e = new s0.b(18);
        dVar.d(687865855, 687865855);
        dVar.c(352321535, 352321535);
        dVar.b(TLObject.FLAG_29, 0);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar.n = dpf2;
        dVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static d f(g6 g6Var) {
        d dVar = new d(g6Var);
        dVar.e = new s0.b(27);
        dVar.d(285212672, 117440511);
        dVar.c(TLObject.FLAG_29, 301989887);
        dVar.b(TLObject.FLAG_29, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.667f);
        float dpf22 = AndroidUtilities.dpf2(0.85f);
        dVar.n = dpf2;
        dVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        dVar.f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static d g(g6 g6Var) {
        d dVar = new d(g6Var);
        dVar.e = new s0.b(19);
        dVar.d(1157627903, 0);
        dVar.c(587202559, 0);
        dVar.b(939524096, 0);
        dVar.n = AndroidUtilities.dpf2(3.5f);
        dVar.r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f = dpf2;
        dVar.h = dpf22;
        return dVar;
    }

    public static d h(g6 g6Var) {
        return g(g6Var);
    }

    public static d i(g6 g6Var) {
        d dVar = new d(g6Var);
        dVar.e = new a(1);
        dVar.d(687865855, 687865855);
        dVar.c(352321535, 352321535);
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f = dpf2;
        dVar.h = dpf22;
        return dVar;
    }

    public static d j(g6 g6Var) {
        d dVar = new d(g6Var);
        dVar.e = new s0.b(29);
        dVar.d(-1, 553648127);
        dVar.c(0, 553648127);
        dVar.b(805306368, 83886079);
        float dpf2 = AndroidUtilities.dpf2(4.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        dVar.n = dpf2;
        dVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.67f);
        float dpf24 = AndroidUtilities.dpf2(0.67f);
        dVar.f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static d k(g6 g6Var) {
        d dVar = new d(g6Var);
        dVar.e = new s0.b(26);
        dVar.d(1157627903, 0);
        dVar.c(587202559, 0);
        dVar.b(637534208, 0);
        dVar.n = AndroidUtilities.dpf2(4.0f);
        dVar.r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f = dpf2;
        dVar.h = dpf22;
        return dVar;
    }

    public static d l(g6 g6Var) {
        d dVar = new d(g6Var);
        dVar.d(0, 687865855);
        dVar.c(0, 352321535);
        dVar.b(805306368, 83886079);
        float dpf2 = AndroidUtilities.dpf2(4.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        dVar.n = dpf2;
        dVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        dVar.f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static int m(float f10, int i10, int i11) {
        float a2 = o.a(f10, 0.0f, 1.0f);
        if (a2 <= 0.0f) {
            return Color.argb(0, 0, 0, 0);
        }
        if (a2 >= 1.0f) {
            return Color.argb(255, Color.red(i11), Color.green(i11), Color.blue(i11));
        }
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        float f11 = 1.0f - a2;
        return Color.argb(o.b(Math.round(a2 * 255.0f), 0, 255), o.b(Math.round((Color.red(i11) - (red * f11)) / a2), 0, 255), o.b(Math.round((Color.green(i11) - (green * f11)) / a2), 0, 255), o.b(Math.round((Color.blue(i11) - (blue * f11)) / a2), 0, 255));
    }

    public static d n(g6 g6Var) {
        d dVar = new d(g6Var);
        dVar.e = new s0.b(20);
        dVar.d(285212672, 117440511);
        dVar.c(TLObject.FLAG_29, 301989887);
        dVar.b(TLObject.FLAG_29, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.667f);
        float dpf22 = AndroidUtilities.dpf2(0.85f);
        dVar.n = dpf2;
        dVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        dVar.f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static d o(g6 g6Var) {
        d dVar = new d(g6Var);
        dVar.e = new f0(3, g6Var);
        dVar.d(-1, 553648127);
        dVar.c(-1, 352321535);
        dVar.b(TLObject.FLAG_29, 0);
        float dpf2 = AndroidUtilities.dpf2(0.55f);
        float dpf22 = AndroidUtilities.dpf2(0.55f);
        dVar.f = dpf2;
        dVar.h = dpf22;
        return dVar;
    }

    public static d p(g6 g6Var) {
        d dVar = new d(g6Var);
        dVar.e = new a(0);
        dVar.d(0, 0);
        dVar.c(0, 0);
        dVar.b(0, 0);
        dVar.n = 0.0f;
        dVar.r = 0.0f;
        dVar.f = 0.0f;
        dVar.h = 0.0f;
        return dVar;
    }

    public static d q(g6 g6Var) {
        d dVar = new d(g6Var);
        dVar.e = new f0(2, g6Var);
        dVar.d(0, 0);
        dVar.c(0, 0);
        dVar.b(0, 0);
        dVar.n = 0.0f;
        dVar.r = 0.0f;
        dVar.f = 0.0f;
        dVar.h = 0.0f;
        return dVar;
    }
}
