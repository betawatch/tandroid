// default package

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioRecord;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class zm6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MediaController b;

    public /* synthetic */ zm6(MediaController mediaController, byte b) {
        this.a = b;
        this.b = mediaController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        MediaController mediaController = this.b;
        switch (b) {
            case 0:
                String[] strArr = MediaController.W1;
                try {
                    mediaController.B1 = (char) 48000;
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 1280;
                    }
                    mediaController.A1 = minBufferSize;
                    while (i < 5) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mediaController.A1);
                        allocateDirect.order(ByteOrder.nativeOrder());
                        mediaController.y1.add(allocateDirect);
                        i++;
                    }
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 1:
                String[] strArr2 = MediaController.W1;
                try {
                    mediaController.q0 = oc7.d1().getFloat("playbackSpeed", 1.0f);
                    mediaController.r0 = oc7.d1().getFloat("musicPlaybackSpeed", 1.0f);
                    mediaController.s0 = oc7.d1().getFloat("fastPlaybackSpeed", 1.8f);
                    mediaController.t0 = oc7.d1().getFloat("fastMusicPlaybackSpeed", 1.8f);
                    SensorManager sensorManager = (SensorManager) a.b.getSystemService("sensor");
                    mediaController.c = sensorManager;
                    mediaController.h = sensorManager.getDefaultSensor(10);
                    Sensor defaultSensor = mediaController.c.getDefaultSensor(9);
                    mediaController.n = defaultSensor;
                    if (mediaController.h == null || defaultSensor == null) {
                        if (e21.a) {
                            fc4.b("gravity or linear sensor not found");
                        }
                        mediaController.f = mediaController.c.getDefaultSensor(1);
                        mediaController.h = null;
                        mediaController.n = null;
                    }
                    mediaController.e = mediaController.c.getDefaultSensor(8);
                    mediaController.d = ((PowerManager) a.b.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock");
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
                try {
                    vn6 vn6Var = new vn6(mediaController);
                    TelephonyManager telephonyManager = (TelephonyManager) a.b.getSystemService("phone");
                    if (telephonyManager != null) {
                        telephonyManager.listen(vn6Var, 32);
                        break;
                    }
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    return;
                }
                break;
            case 2:
                String[] strArr3 = MediaController.W1;
                while (i < 4) {
                    nm7.f(i).a(mediaController, nm7.Y1);
                    nm7.f(i).a(mediaController, nm7.R1);
                    nm7.f(i).a(mediaController, 1);
                    nm7.f(i).a(mediaController, 7);
                    nm7.f(i).a(mediaController, 42);
                    nm7.f(i).a(mediaController, 74);
                    nm7.f(i).a(mediaController, 33);
                    nm7.f(i).a(mediaController, nm7.W3);
                    nm7.e().a(mediaController, nm7.L4);
                    i++;
                }
                break;
            case 3:
                String[] strArr4 = MediaController.W1;
                Sensor sensor = mediaController.n;
                if (sensor != null) {
                    mediaController.c.registerListener(mediaController, sensor, 30000);
                }
                Sensor sensor2 = mediaController.h;
                if (sensor2 != null) {
                    mediaController.c.registerListener(mediaController, sensor2, 30000);
                }
                Sensor sensor3 = mediaController.f;
                if (sensor3 != null) {
                    mediaController.c.registerListener(mediaController, sensor3, 30000);
                }
                mediaController.c.registerListener(mediaController, mediaController.e, 3);
                break;
            case 4:
                String[] strArr5 = MediaController.W1;
                mediaController.l(true, true, false, false);
                break;
            case 5:
                String[] strArr6 = MediaController.W1;
                Sensor sensor4 = mediaController.h;
                if (sensor4 != null) {
                    mediaController.c.unregisterListener(mediaController, sensor4);
                }
                Sensor sensor5 = mediaController.n;
                if (sensor5 != null) {
                    mediaController.c.unregisterListener(mediaController, sensor5);
                }
                Sensor sensor6 = mediaController.f;
                if (sensor6 != null) {
                    mediaController.c.unregisterListener(mediaController, sensor6);
                }
                mediaController.c.unregisterListener(mediaController, mediaController.e);
                break;
            case 6:
                String[] strArr7 = MediaController.W1;
                mediaController.M();
                break;
            case 7:
                String[] strArr8 = MediaController.W1;
                mediaController.M1 = null;
                nm7.f(mediaController.i1).k(nm7.m2, Integer.valueOf(mediaController.h1));
                break;
            case 8:
                String[] strArr9 = MediaController.W1;
                mediaController.X(true);
                mediaController.f1 = new AudioRecord(0, mediaController.B1, 16, 2, mediaController.A1);
                System.currentTimeMillis();
                mediaController.m1 = 0;
                mediaController.w1 = 0L;
                mediaController.z1.rewind();
                mediaController.f1.startRecording();
                mediaController.N1.c(mediaController.P1);
                nm7.f(mediaController.i1).k(nm7.p2, new Object[0]);
                break;
            default:
                String[] strArr10 = MediaController.W1;
                mediaController.l(true, true, false, false);
                break;
        }
    }
}
