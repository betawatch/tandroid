package org.webrtc;

import java.util.List;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public interface CameraEnumerator {
    CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler);

    String[] getDeviceNames();

    List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str);

    boolean isBackFacing(String str);

    boolean isFrontFacing(String str);
}
