FROM node:22 as build

WORKDIR /app

COPY package*.json ./

RUN npm install

COPY . .

RUN npm run build


FROM nginx:alpine

COPY --from=build /app/dist/frontend/browser /usr/share/nginx/html
