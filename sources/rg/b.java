package rg;

import android.graphics.Color;
import dg.h0;
import k7.n;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.cl0;
import qg.d;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class b {
    public static d a(f6 f6Var) {
        d dVar = new d(f6Var);
        dVar.e = new a(6);
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

    public static d b(f6 f6Var) {
        d dVar = new d(f6Var);
        dVar.e = new h0(1, f6Var);
        dVar.d(-1, 687865855);
        dVar.c(-1, 352321535);
        dVar.b(TLObject.FLAG_29, 0);
        float dpf2 = AndroidUtilities.dpf2(0.5f);
        float dpf22 = AndroidUtilities.dpf2(0.5f);
        dVar.f = dpf2;
        dVar.h = dpf22;
        return dVar;
    }

    public static boolean c(int i10, f6 f6Var) {
        boolean a2 = f6Var != null ? f6Var.a() : j6.I.q();
        boolean chatBlurEnabled = SharedConfig.chatBlurEnabled();
        if (chatBlurEnabled && !a2 && MessagesController.getInstance(i10).config.disableBlurInLightTheme.get()) {
            chatBlurEnabled = false;
        }
        if (chatBlurEnabled && a2 && MessagesController.getInstance(i10).config.disableBlurInDarkTheme.get()) {
            return false;
        }
        return chatBlurEnabled;
    }

    public static d d(f6 f6Var) {
        d dVar = new d(f6Var);
        dVar.e = new a(10);
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

    public static d e(f6 f6Var) {
        d dVar = new d(f6Var);
        dVar.e = new cl0(26);
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

    public static d f(f6 f6Var) {
        d dVar = new d(f6Var);
        dVar.e = new a(5);
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

    public static d g(f6 f6Var) {
        d dVar = new d(f6Var);
        dVar.e = new cl0(27);
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

    public static d h(f6 f6Var) {
        return g(f6Var);
    }

    public static d i(f6 f6Var) {
        d dVar = new d(f6Var);
        dVar.e = new a(9);
        dVar.d(687865855, 687865855);
        dVar.c(352321535, 352321535);
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f = dpf2;
        dVar.h = dpf22;
        return dVar;
    }

    public static d j(f6 f6Var) {
        d dVar = new d(f6Var);
        dVar.e = new a(7);
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

    public static d k(f6 f6Var) {
        d dVar = new d(f6Var);
        dVar.e = new a(4);
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

    public static d l(f6 f6Var) {
        d dVar = new d(f6Var);
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
        float a2 = n.a(f10, 0.0f, 1.0f);
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
        return Color.argb(n.b(Math.round(a2 * 255.0f), 0, 255), n.b(Math.round((Color.red(i11) - (red * f11)) / a2), 0, 255), n.b(Math.round((Color.green(i11) - (green * f11)) / a2), 0, 255), n.b(Math.round((Color.blue(i11) - (blue * f11)) / a2), 0, 255));
    }

    public static d n(f6 f6Var) {
        d dVar = new d(f6Var);
        dVar.e = new cl0(28);
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

    public static d o(f6 f6Var) {
        d dVar = new d(f6Var);
        dVar.e = new h0(3, f6Var);
        dVar.d(-1, 553648127);
        dVar.c(-1, 352321535);
        dVar.b(TLObject.FLAG_29, 0);
        float dpf2 = AndroidUtilities.dpf2(0.55f);
        float dpf22 = AndroidUtilities.dpf2(0.55f);
        dVar.f = dpf2;
        dVar.h = dpf22;
        return dVar;
    }

    public static d p(f6 f6Var) {
        d dVar = new d(f6Var);
        dVar.e = new a(8);
        dVar.d(0, 0);
        dVar.c(0, 0);
        dVar.b(0, 0);
        dVar.n = 0.0f;
        dVar.r = 0.0f;
        dVar.f = 0.0f;
        dVar.h = 0.0f;
        return dVar;
    }

    public static d q(f6 f6Var) {
        d dVar = new d(f6Var);
        dVar.e = new h0(2, f6Var);
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
