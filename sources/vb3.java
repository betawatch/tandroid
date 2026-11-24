// default package

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class vb3 {
    public final Context a;
    public final p13 b;
    public boolean c = false;

    public vb3(Context context) {
        this.a = context;
        this.b = new p13(context, (char) 0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(2:10|11)|12|13|14|(12:(2:15|16)|23|24|25|26|27|28|29|30|31|32|(3:34|35|37))|17|18|19|20|21) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:75|76|12|13|14|15|16|17|18|19|20|21|23|24|25|(2:26|27)|28|29|30|31|32|34|35|37) */
    /* JADX WARN: Can't wrap try/catch for region: R(28:3|(1:5)|6|7|8|9|10|11|12|13|14|(2:15|16)|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|(3:34|35|37)) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:10|11)|(12:(2:15|16)|23|24|25|26|27|28|29|30|31|32|(3:34|35|37))|17|18|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014a, code lost:
    
        r14 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0154, code lost:
    
        r9 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c7, code lost:
    
        r14 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d1, code lost:
    
        r9 = r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Context context, int i, x30 x30Var, Handler handler, t54 t54Var, ArrayList arrayList) {
        int i2;
        int i3;
        int i4;
        int i5;
        arrayList.add(new fk6(context, this.b, handler, t54Var, x30Var));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
            } catch (ClassNotFoundException unused) {
            }
            try {
                try {
                    try {
                        arrayList.add(size, (ug0) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class, Handler.class, o30.class, x30.class).newInstance(context, handler, t54Var, x30Var));
                        lad.e("DefaultRenderersFactory", "Loaded MidiRenderer.");
                    } catch (ClassNotFoundException unused2) {
                        size = i2;
                        i2 = size;
                        i3 = i2 + 1;
                        arrayList.add(i2, (ug0) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, o30.class, x30.class).newInstance(handler, t54Var, x30Var));
                        lad.e("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                        i4 = i3 + 1;
                        arrayList.add(i3, (ug0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, o30.class, x30.class).newInstance(handler, t54Var, x30Var));
                        lad.e("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        try {
                            i5 = i4 + 1;
                        } catch (ClassNotFoundException unused3) {
                        }
                        try {
                            try {
                                arrayList.add(i4, (ug0) FfmpegAudioRenderer.class.getConstructor(Handler.class, o30.class, x30.class).newInstance(handler, t54Var, x30Var));
                                lad.e("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                            } catch (ClassNotFoundException unused4) {
                                i4 = i5;
                                i5 = i4;
                                Class<?> cls = Class.forName("androidx.media3.decoder.iamf.IamfAudioRenderer$Builder");
                                Object newInstance = cls.getConstructor(x30.class).newInstance(x30Var);
                                cls.getMethod("setEventHandlerAndListener", Handler.class, o30.class).invoke(newInstance, handler, t54Var);
                                ug0 ug0Var = (ug0) cls.getMethod("build", null).invoke(newInstance, null);
                                ug0Var.getClass();
                                int i6 = i5 + 1;
                                arrayList.add(i5, ug0Var);
                                lad.e("DefaultRenderersFactory", "Loaded IamfAudioRenderer.");
                                arrayList.add(i6, (ug0) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, o30.class, x30.class).newInstance(handler, t54Var, x30Var));
                                lad.e("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                                return;
                            }
                            Class<?> cls2 = Class.forName("androidx.media3.decoder.iamf.IamfAudioRenderer$Builder");
                            Object newInstance2 = cls2.getConstructor(x30.class).newInstance(x30Var);
                            cls2.getMethod("setEventHandlerAndListener", Handler.class, o30.class).invoke(newInstance2, handler, t54Var);
                            ug0 ug0Var2 = (ug0) cls2.getMethod("build", null).invoke(newInstance2, null);
                            ug0Var2.getClass();
                            int i62 = i5 + 1;
                            arrayList.add(i5, ug0Var2);
                            lad.e("DefaultRenderersFactory", "Loaded IamfAudioRenderer.");
                            arrayList.add(i62, (ug0) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, o30.class, x30.class).newInstance(handler, t54Var, x30Var));
                            lad.e("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                            return;
                        } catch (Exception e) {
                            k93.h("Error instantiating IAMF extension", e);
                            return;
                        }
                    }
                    try {
                        try {
                            arrayList.add(i2, (ug0) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, o30.class, x30.class).newInstance(handler, t54Var, x30Var));
                            lad.e("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                        } catch (ClassNotFoundException unused5) {
                            i2 = i3;
                            i3 = i2;
                            i4 = i3 + 1;
                            arrayList.add(i3, (ug0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, o30.class, x30.class).newInstance(handler, t54Var, x30Var));
                            lad.e("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                            i5 = i4 + 1;
                            arrayList.add(i4, (ug0) FfmpegAudioRenderer.class.getConstructor(Handler.class, o30.class, x30.class).newInstance(handler, t54Var, x30Var));
                            lad.e("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                            Class<?> cls22 = Class.forName("androidx.media3.decoder.iamf.IamfAudioRenderer$Builder");
                            Object newInstance22 = cls22.getConstructor(x30.class).newInstance(x30Var);
                            cls22.getMethod("setEventHandlerAndListener", Handler.class, o30.class).invoke(newInstance22, handler, t54Var);
                            ug0 ug0Var22 = (ug0) cls22.getMethod("build", null).invoke(newInstance22, null);
                            ug0Var22.getClass();
                            int i622 = i5 + 1;
                            arrayList.add(i5, ug0Var22);
                            lad.e("DefaultRenderersFactory", "Loaded IamfAudioRenderer.");
                            arrayList.add(i622, (ug0) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, o30.class, x30.class).newInstance(handler, t54Var, x30Var));
                            lad.e("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                            return;
                        }
                        i5 = i4 + 1;
                        arrayList.add(i4, (ug0) FfmpegAudioRenderer.class.getConstructor(Handler.class, o30.class, x30.class).newInstance(handler, t54Var, x30Var));
                        lad.e("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        Class<?> cls222 = Class.forName("androidx.media3.decoder.iamf.IamfAudioRenderer$Builder");
                        Object newInstance222 = cls222.getConstructor(x30.class).newInstance(x30Var);
                        cls222.getMethod("setEventHandlerAndListener", Handler.class, o30.class).invoke(newInstance222, handler, t54Var);
                        ug0 ug0Var222 = (ug0) cls222.getMethod("build", null).invoke(newInstance222, null);
                        ug0Var222.getClass();
                        int i6222 = i5 + 1;
                        arrayList.add(i5, ug0Var222);
                        lad.e("DefaultRenderersFactory", "Loaded IamfAudioRenderer.");
                        try {
                            arrayList.add(i6222, (ug0) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, o30.class, x30.class).newInstance(handler, t54Var, x30Var));
                            lad.e("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                            return;
                        } catch (ClassNotFoundException unused6) {
                            return;
                        } catch (Exception e2) {
                            k93.h("Error instantiating MPEG-H extension", e2);
                            return;
                        }
                    } catch (Exception e3) {
                        k93.h("Error instantiating FFmpeg extension", e3);
                        return;
                    }
                    i4 = i3 + 1;
                    arrayList.add(i3, (ug0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, o30.class, x30.class).newInstance(handler, t54Var, x30Var));
                    lad.e("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                } catch (Exception e4) {
                    k93.h("Error instantiating FLAC extension", e4);
                    return;
                }
                i3 = i2 + 1;
            } catch (Exception e5) {
                k93.h("Error instantiating Opus extension", e5);
            }
        } catch (Exception e6) {
            k93.h("Error instantiating MIDI extension", e6);
        }
    }

    public q93 b(Context context) {
        return new c30(context, (byte) 2).b();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    public void c(Context context, int i, Handler handler, t54 t54Var, ArrayList arrayList) {
        char c;
        int i2;
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        tk6 tk6Var = new tk6(context);
        tk6Var.c = this.b;
        tk6Var.d = (short) 5000;
        tk6Var.e = handler;
        tk6Var.f = t54Var;
        tk6Var.g = (byte) 50;
        gre.p(!tk6Var.b);
        Handler handler2 = tk6Var.e;
        t54 t54Var2 = tk6Var.f;
        gre.p(handler2 != null ? t54Var2 != null : t54Var2 == null);
        tk6Var.b = true;
        arrayList.add(new vk6(tk6Var));
        if (i != 0) {
            int size = arrayList.size();
            if (i == 2) {
                size--;
            }
            try {
                try {
                    c = 2;
                    try {
                        i2 = size + 1;
                        try {
                            arrayList.add(size, (ug0) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, xbc.class, cls).newInstance(5000L, handler, t54Var, 50));
                            lad.e("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                        } catch (ClassNotFoundException unused) {
                            size = i2;
                            i2 = size;
                            try {
                                Class<?> cls3 = Class.forName("androidx.media3.decoder.av1.Libdav1dVideoRenderer");
                                Class<?>[] clsArr = new Class[4];
                                clsArr[0] = cls2;
                                clsArr[1] = Handler.class;
                                clsArr[c] = xbc.class;
                                clsArr[3] = cls;
                                Constructor<?> constructor = cls3.getConstructor(clsArr);
                                Object[] objArr = new Object[4];
                                objArr[0] = 5000L;
                                objArr[1] = handler;
                                objArr[c] = t54Var;
                                objArr[3] = 50;
                                ug0 ug0Var = (ug0) constructor.newInstance(objArr);
                                int i3 = i2 + 1;
                                try {
                                    arrayList.add(i2, ug0Var);
                                    lad.e("DefaultRenderersFactory", "Loaded Libdav1dVideoRenderer.");
                                } catch (ClassNotFoundException unused2) {
                                    i2 = i3;
                                    i3 = i2;
                                    int i4 = ExperimentalFfmpegVideoRenderer.y0;
                                    Class[] clsArr2 = new Class[4];
                                    clsArr2[0] = cls2;
                                    clsArr2[1] = Handler.class;
                                    clsArr2[c] = xbc.class;
                                    clsArr2[3] = cls;
                                    Constructor constructor2 = ExperimentalFfmpegVideoRenderer.class.getConstructor(clsArr2);
                                    Object[] objArr2 = new Object[4];
                                    objArr2[0] = 5000L;
                                    objArr2[1] = handler;
                                    objArr2[c] = t54Var;
                                    objArr2[3] = 50;
                                    arrayList.add(i3, (ug0) constructor2.newInstance(objArr2));
                                    lad.e("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                                }
                                int i42 = ExperimentalFfmpegVideoRenderer.y0;
                                Class[] clsArr22 = new Class[4];
                                clsArr22[0] = cls2;
                                clsArr22[1] = Handler.class;
                                clsArr22[c] = xbc.class;
                                clsArr22[3] = cls;
                                Constructor constructor22 = ExperimentalFfmpegVideoRenderer.class.getConstructor(clsArr22);
                                Object[] objArr22 = new Object[4];
                                objArr22[0] = 5000L;
                                objArr22[1] = handler;
                                objArr22[c] = t54Var;
                                objArr22[3] = 50;
                                arrayList.add(i3, (ug0) constructor22.newInstance(objArr22));
                                lad.e("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                            } catch (Exception e) {
                                k93.h("Error instantiating AV1 extension", e);
                                return;
                            }
                        }
                    } catch (ClassNotFoundException unused3) {
                    }
                } catch (ClassNotFoundException unused4) {
                    c = 2;
                }
                try {
                    Class<?> cls32 = Class.forName("androidx.media3.decoder.av1.Libdav1dVideoRenderer");
                    Class<?>[] clsArr3 = new Class[4];
                    clsArr3[0] = cls2;
                    clsArr3[1] = Handler.class;
                    clsArr3[c] = xbc.class;
                    clsArr3[3] = cls;
                    Constructor<?> constructor3 = cls32.getConstructor(clsArr3);
                    Object[] objArr3 = new Object[4];
                    objArr3[0] = 5000L;
                    objArr3[1] = handler;
                    objArr3[c] = t54Var;
                    objArr3[3] = 50;
                    ug0 ug0Var2 = (ug0) constructor3.newInstance(objArr3);
                    int i32 = i2 + 1;
                    arrayList.add(i2, ug0Var2);
                    lad.e("DefaultRenderersFactory", "Loaded Libdav1dVideoRenderer.");
                } catch (ClassNotFoundException unused5) {
                }
                try {
                    int i422 = ExperimentalFfmpegVideoRenderer.y0;
                    Class[] clsArr222 = new Class[4];
                    clsArr222[0] = cls2;
                    clsArr222[1] = Handler.class;
                    clsArr222[c] = xbc.class;
                    clsArr222[3] = cls;
                    Constructor constructor222 = ExperimentalFfmpegVideoRenderer.class.getConstructor(clsArr222);
                    Object[] objArr222 = new Object[4];
                    objArr222[0] = 5000L;
                    objArr222[1] = handler;
                    objArr222[c] = t54Var;
                    objArr222[3] = 50;
                    arrayList.add(i32, (ug0) constructor222.newInstance(objArr222));
                    lad.e("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                } catch (ClassNotFoundException unused6) {
                } catch (Exception e2) {
                    k93.h("Error instantiating FFmpeg extension", e2);
                }
            } catch (Exception e3) {
                k93.h("Error instantiating VP9 extension", e3);
            }
        }
    }

    public final ug0[] d(Handler handler, t54 t54Var, t54 t54Var2, t54 t54Var3, t54 t54Var4) {
        ArrayList arrayList = new ArrayList();
        c(this.a, this.c ? 1 : 0, handler, t54Var, arrayList);
        Context context = this.a;
        a(this.a, this.c ? 1 : 0, b(context), handler, t54Var2, arrayList);
        arrayList.add(new zhb(t54Var3, handler.getLooper()));
        Looper looper = handler.getLooper();
        for (int i = 0; i < 4; i++) {
            arrayList.add(new qd7(t54Var4, looper));
        }
        arrayList.add(new t91());
        arrayList.add(new ql5(new uj0(context, (byte) 0)));
        return (ug0[]) arrayList.toArray(new ug0[0]);
    }
}
