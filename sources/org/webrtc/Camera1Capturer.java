package org.webrtc;

import android.content.Context;
import org.webrtc.CameraSession;
import org.webrtc.CameraVideoCapturer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public class Camera1Capturer extends CameraCapturer {
    private final boolean captureToTexture;

    public Camera1Capturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, boolean z4) {
        super(str, cameraEventsHandler, new Camera1Enumerator(z4));
        this.captureToTexture = z4;
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void changeCaptureFormat(int i10, int i11, int i12) {
        super.changeCaptureFormat(i10, i11, i12);
    }

    @Override // org.webrtc.CameraCapturer
    public void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i10, int i11, int i12) {
        Camera1Session.create(createSessionCallback, events, this.captureToTexture, context, surfaceTextureHelper, str, i10, i11, i12);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void dispose() {
        super.dispose();
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        super.initialize(surfaceTextureHelper, context, capturerObserver);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ boolean isScreencast() {
        return super.isScreencast();
    }

    @Override // org.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ void printStackTrace() {
        super.printStackTrace();
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void startCapture(int i10, int i11, int i12) {
        super.startCapture(i10, i11, i12);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void stopCapture() {
        super.stopCapture();
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        super.switchCamera(cameraSwitchHandler);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, String str) {
        super.switchCamera(cameraSwitchHandler, str);
    }
}
