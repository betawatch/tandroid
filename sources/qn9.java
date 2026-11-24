// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.nio.ByteBuffer;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.webrtc.JavaI420Buffer;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class qn9 {
    public final ImageReceiver a;
    public VideoFrame b;

    public qn9() {
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.a = imageReceiver;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        TLRPC.Chat chat = sharedInstance != null ? sharedInstance.getChat() : null;
        pb0 pb0Var = new pb0((wjb) null);
        if (chat != null) {
            sharedInstance.getAccount();
            pb0Var.p(chat);
            imageReceiver.d = sharedInstance.getAccount();
        }
        imageReceiver.q0(60);
        imageReceiver.h1 = new wh9(this, (byte) 6);
        imageReceiver.I();
        imageReceiver.d0(chat != null ? gl5.a(1, chat) : null, "100_100", pb0Var, null, chat, 0);
        a();
    }

    public final void a() {
        ByteBuffer byteBuffer;
        Bitmap createBitmap = Bitmap.createBitmap(640, 360, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-14999773);
        ImageReceiver imageReceiver = this.a;
        imageReceiver.i0(260.0f, 120.0f, 120.0f, 120.0f);
        imageReceiver.h(canvas, null);
        int width = createBitmap.getWidth();
        int height = createBitmap.getHeight();
        int[] iArr = new int[width * height];
        createBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        JavaI420Buffer allocate = JavaI420Buffer.allocate(width, height);
        ByteBuffer dataY = allocate.getDataY();
        ByteBuffer dataU = allocate.getDataU();
        ByteBuffer dataV = allocate.getDataV();
        int strideY = allocate.getStrideY();
        int strideU = allocate.getStrideU();
        int strideV = allocate.getStrideV();
        for (int i = 0; i < height; i++) {
            int i2 = 0;
            while (i2 < width) {
                int i3 = iArr[(i * width) + i2];
                Bitmap bitmap = createBitmap;
                int i4 = (i3 >> 16) & kk7.d4;
                int i5 = (i3 >> 8) & kk7.d4;
                int i6 = i3 & kk7.d4;
                int[] iArr2 = iArr;
                int i7 = width;
                dataY.put((i * strideY) + i2, (byte) (((((i6 * 25) + ((i5 * kk7.M1) + (i4 * 66))) + 128) >> 8) + 16));
                if ((i & 1) == 0 && (i2 & 1) == 0) {
                    int i8 = i >> 1;
                    int i9 = i2 >> 1;
                    byteBuffer = dataY;
                    dataU.put((i8 * strideU) + i9, (byte) (((((i6 * kk7.w1) + ((i4 * (-38)) - (i5 * 74))) + 128) >> 8) + 128));
                    dataV.put((i8 * strideV) + i9, (byte) ((((((i4 * kk7.w1) - (i5 * 94)) - (i6 * 18)) + 128) >> 8) + 128));
                } else {
                    byteBuffer = dataY;
                }
                i2++;
                createBitmap = bitmap;
                iArr = iArr2;
                width = i7;
                dataY = byteBuffer;
            }
        }
        VideoFrame videoFrame = new VideoFrame(allocate, 0, 0L);
        createBitmap.recycle();
        VideoFrame videoFrame2 = this.b;
        if (videoFrame2 != null) {
            videoFrame2.release();
        }
        this.b = videoFrame;
    }
}
