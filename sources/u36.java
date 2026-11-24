// default package

import android.media.MediaCodecInfo;
import android.media.MediaRoute2Info;
import android.os.Build;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class u36 implements ee, fu2, sm6, ku4, sx6, lz6 {
    public final /* synthetic */ byte a;

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint e(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info f(Object obj) {
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

    @Override // sm6
    public final int a(Object obj) {
        String str = ((lm6) obj).a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // fu2
    public final void accept(Object obj) {
        switch (this.a) {
            case 3:
                ((ExecutorService) obj).shutdown();
                break;
            default:
                ((cf8) obj).C0();
                break;
        }
    }

    @Override // sx6
    public final void d(rw6 rw6Var, int i) {
        switch (this.a) {
            case 24:
                rw6Var.getClass();
                break;
            case 25:
                rw6Var.b(i);
                break;
            default:
                rw6Var.getClass();
                break;
        }
    }

    @Override // ku4
    public final Object l(Object obj) {
        switch (this.a) {
            case 18:
                return new TLRPC.TL_messageEntityBold();
            case 19:
                return new TLRPC.TL_messageEntityItalic();
            case 20:
                return new TLRPC.TL_messageEntitySpoiler();
            default:
                return new TLRPC.TL_messageEntityStrike();
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        switch (this.a) {
            case 0:
                heVar.dismiss();
                break;
            default:
                heVar.dismiss();
                break;
        }
    }

    @Override // lz6
    public final Object t(tx6 tx6Var, sw6 sw6Var, int i) {
        switch (this.a) {
            case 27:
                tx6Var.getClass();
                throw new ClassCastException();
            default:
                tx6Var.getClass();
                throw new ClassCastException();
        }
    }

    public /* synthetic */ u36(byte b) {
        this.a = b;
    }
}
