// default package

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Set;
import org.scilab.forge.jlatexmath.XMLResourceParseException;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class wa3 implements x76, lr2, ee, xmb, ymb, hs3, os4, ku4, Vector.TLDeserializer, z0c {
    public final /* synthetic */ byte a;

    public /* synthetic */ wa3(m54 m54Var) {
        this.a = (byte) 29;
    }

    public static /* synthetic */ void c(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void d(String str) {
        throw new IOException(str);
    }

    public static /* synthetic */ void f(String str, String str2, String str3, String str4) {
        throw new XMLResourceParseException(str, str2, str3, str4);
    }

    public static /* synthetic */ void h(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    public static /* synthetic */ void i(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    @Override // lr2
    public final Object X(sm2 sm2Var) {
        Set N = sm2Var.N(ya0.class);
        sz4 sz4Var = sz4.b;
        if (sz4Var == null) {
            synchronized (sz4.class) {
                sz4Var = sz4.b;
                if (sz4Var == null) {
                    sz4Var = new sz4((byte) 0);
                    sz4.b = sz4Var;
                }
            }
        }
        return new ge3(N, sz4Var);
    }

    @Override // os4
    public final u31 a(c41 c41Var) {
        return c41Var.k(false);
    }

    @Override // z0c
    public final Object apply(Object obj) {
        e8a e8aVar = (e8a) obj;
        String s = f8a.b.s(e8aVar);
        s.getClass();
        e8aVar.getClass();
        Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
        byte[] bytes = s.getBytes(jl1.a);
        bytes.getClass();
        return bytes;
    }

    public final Constructor b() {
        switch (this.a) {
            case 5:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(s84.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(s84.class).getConstructor(null);
        }
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i, z);
    }

    @Override // ymb
    public final void e(int i, View view) {
        Drawable background = view.getBackground();
        if (background instanceof sn2) {
            Drawable drawable = ((sn2) background).a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(i);
                view.invalidate();
            }
        }
    }

    @Override // xmb
    public final int g(View view) {
        Drawable background = view.getBackground();
        if (!(background instanceof sn2)) {
            return 0;
        }
        Drawable drawable = ((sn2) background).a;
        if (drawable instanceof ColorDrawable) {
            return ((ColorDrawable) drawable).getColor();
        }
        return 0;
    }

    @Override // x76
    public final void invoke(Object obj) {
        uk ukVar = (uk) obj;
        switch (this.a) {
            case 0:
                ukVar.getClass();
                break;
            case 1:
                ukVar.getClass();
                break;
            case 2:
                ukVar.getClass();
                break;
            case 3:
                ukVar.getClass();
                break;
            default:
                ukVar.getClass();
                break;
        }
    }

    @Override // ku4
    public final Object l(Object obj) {
        int i = e34.U2;
        return 0;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        switch (this.a) {
            case 10:
                oc7.e1().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                break;
            default:
                oc7.e1().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                break;
        }
    }

    public /* synthetic */ wa3(byte b) {
        this.a = b;
    }

    @Override // hs3
    public final void release() {
    }
}
