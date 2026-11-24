// default package

import android.media.MediaCodecInfo;
import android.media.MediaRoute2Info;
import android.os.Build;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class w26 implements us2, pk6, js4, sv6, lx6 {
    public final /* synthetic */ byte a;

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint d(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info e(Object obj) {
        return (MediaRoute2Info) obj;
    }

    public static /* synthetic */ void g() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void h(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void j(String str) {
        throw new IllegalArgumentException(str);
    }

    @Override // pk6
    public final int a(Object obj) {
        String str = ((ik6) obj).a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // us2
    public final void accept(Object obj) {
        switch (this.a) {
            case 1:
                ((ExecutorService) obj).shutdown();
                break;
            case 27:
                ((ad8) obj).C0();
                break;
            default:
                ((ad8) obj).d0();
                break;
        }
    }

    @Override // sv6
    public final void f(ru6 ru6Var, int i) {
        switch (this.a) {
            case 22:
                ru6Var.getClass();
                break;
            case 23:
                ru6Var.b(i);
                break;
            default:
                ru6Var.getClass();
                break;
        }
    }

    @Override // js4
    public final Object m(Object obj) {
        switch (this.a) {
            case 16:
                return new TLRPC.TL_messageEntityBold();
            case 17:
                return new TLRPC.TL_messageEntityItalic();
            case 18:
                return new TLRPC.TL_messageEntitySpoiler();
            default:
                return new TLRPC.TL_messageEntityStrike();
        }
    }

    @Override // lx6
    public final Object p(tv6 tv6Var, su6 su6Var, int i) {
        switch (this.a) {
            case 25:
                tv6Var.getClass();
                throw new ClassCastException();
            case 26:
                tv6Var.getClass();
                throw new ClassCastException();
            default:
                return tv6Var.m(su6Var);
        }
    }

    public /* synthetic */ w26(byte b) {
        this.a = b;
    }
}
