package org.webrtc;

import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public interface NetworkChangeDetector {

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    public enum ConnectionType {
        CONNECTION_UNKNOWN,
        CONNECTION_ETHERNET,
        CONNECTION_WIFI,
        CONNECTION_5G,
        CONNECTION_4G,
        CONNECTION_3G,
        CONNECTION_2G,
        CONNECTION_UNKNOWN_CELLULAR,
        CONNECTION_BLUETOOTH,
        CONNECTION_VPN,
        CONNECTION_NONE
    }

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    public static class IPAddress {
        public final byte[] address;

        public IPAddress(byte[] bArr) {
            this.address = bArr;
        }

        private byte[] getAddress() {
            return this.address;
        }
    }

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    public static class NetworkInformation {
        public final long handle;
        public final IPAddress[] ipAddresses;
        public final String name;
        public final ConnectionType type;
        public final ConnectionType underlyingTypeForVpn;

        public NetworkInformation(String str, ConnectionType connectionType, ConnectionType connectionType2, long j, IPAddress[] iPAddressArr) {
            this.name = str;
            this.type = connectionType;
            this.underlyingTypeForVpn = connectionType2;
            this.handle = j;
            this.ipAddresses = iPAddressArr;
        }

        private ConnectionType getConnectionType() {
            return this.type;
        }

        private long getHandle() {
            return this.handle;
        }

        private IPAddress[] getIpAddresses() {
            return this.ipAddresses;
        }

        private String getName() {
            return this.name;
        }

        private ConnectionType getUnderlyingConnectionTypeForVpn() {
            return this.underlyingTypeForVpn;
        }
    }

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    public interface Observer {
        void onConnectionTypeChanged(ConnectionType connectionType);

        void onNetworkConnect(NetworkInformation networkInformation);

        void onNetworkDisconnect(long j);

        void onNetworkPreference(List<ConnectionType> list, int i);
    }

    void destroy();

    List<NetworkInformation> getActiveNetworkList();

    ConnectionType getCurrentConnectionType();

    boolean supportNetworkCallback();
}
