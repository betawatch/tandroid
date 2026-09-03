package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class zm extends MessageObject {
    @Override // org.telegram.messenger.MessageObject
    public final boolean canDeleteMessage(boolean z4, TLRPC.Chat chat) {
        return false;
    }
}
