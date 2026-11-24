package org.webrtc;

import android.content.Context;
import org.webrtc.NetworkChangeDetector;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public interface NetworkChangeDetectorFactory {
    NetworkChangeDetector create(NetworkChangeDetector.Observer observer, Context context);
}
